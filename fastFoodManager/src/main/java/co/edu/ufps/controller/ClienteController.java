package co.edu.ufps.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.edu.ufps.model.Authority;
import co.edu.ufps.model.Carrito;
import co.edu.ufps.model.Cliente;
import co.edu.ufps.model.Direccion;
import co.edu.ufps.model.Producto;
import co.edu.ufps.repository.ClienteRepo;
import co.edu.ufps.service.interfac.IAuthorityService;
import co.edu.ufps.service.interfac.ICarritoService;
import co.edu.ufps.service.interfac.IClienteService;
import co.edu.ufps.service.interfac.IDireccionService;
import co.edu.ufps.service.interfac.IProductoService;

@Controller
@RequestMapping
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private IDireccionService direccionService;

	@Autowired
	private IAuthorityService authorityservice;

	@Autowired
	private ICarritoService carritoService;

	@Autowired
	private IProductoService productoService;

	@PostMapping("/register/save")
	public String registerSave(@ModelAttribute Cliente cliente, @ModelAttribute Direccion direccion) {
		direccionService.insertar(direccion);
		cliente.setDireccion(direccion);
		Set<Authority> authoritys = new HashSet();
		Authority authority = authorityservice.findAuthority(2l);
		authoritys.add(authority);
		System.err.println(authoritys.toString());
		cliente.setAuthority(authoritys);
		clienteService.insertar(cliente);
		return "redirect:/";
	}

	@GetMapping("/addProducto/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void addProducto(@PathVariable("id") Integer id,HttpServletRequest request) throws Exception{
		System.err.println("La id es" + id);
		System.err.println("El producto es" + productoService.findProducto(id));
		Producto producto=productoService.findProducto(id);
		Cliente cliente=clienteService.findByCorreo(request.getUserPrincipal().getName()).orElse(null);
		Carrito carrito=null;
		for (Carrito carritoAux : cliente.getCarritos()) {
			if (carritoAux.isActivo()) {
				carrito=carritoAux;
			}
		}
		carrito.getProductos().add(producto);
		carritoService.insertar(carrito);
	}
	@GetMapping("/loginPass")
	public String loginPass(HttpServletRequest request) {

		Carrito carrito = new Carrito();
		String user = request.getUserPrincipal().getName();
		System.err.println("El correo es" + user);
		Cliente cliente = clienteService.findByCorreo(user).orElse(null);
		Set<Authority>auth=cliente.getAuthority();
		for (Authority authority : auth) {
			if (authority.getId().equals(1L)) {
				return "redirect:/adminproduc";
			}
		}
		
		
		if (cliente.getCarritos().isEmpty()) {
			carrito.setCliente(cliente);
			carrito.setActivo(true);
			carritoService.insertar(carrito);
			return "redirect:/";
		}
		for (Carrito carritos : cliente.getCarritos()) {
			if (!carritos.isActivo()) {
				carrito.setCliente(cliente);
				carrito.setActivo(true);
				carritoService.insertar(carrito);
			}
		}
		System.err.println("Si paso");
		return "redirect:/";
	}
	
	@PostMapping("/calcularTotal")
	public Model calcularT(Model model) {
		
		
		return model;
	}

}
