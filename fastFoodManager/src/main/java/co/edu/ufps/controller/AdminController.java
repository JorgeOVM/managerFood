package co.edu.ufps.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.ufps.model.Categoria;
import co.edu.ufps.model.Producto;
import co.edu.ufps.service.interfac.ICategoriaService;
import co.edu.ufps.service.interfac.IProductoService;

@Controller
public class AdminController {
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@Autowired
	private IProductoService productoService;


	
	@RequestMapping(value = "/manipuleCatego", method = RequestMethod.POST, params = "Agregar")
	public String insertarCatego(@ModelAttribute Categoria categoria) {
		if(categoriaService.findCategoria(categoria.getId_categoria())!=null) {
			System.err.println("El producto ya existe");
			return "redirect:/adminproduc";
		}
		categoriaService.insertar(categoria);
		return "redirect:/admincate";
		
	}
	
	@RequestMapping(value = "/manipuleCatego", method = RequestMethod.POST, params = "Editar")
	public String editarCatego(@ModelAttribute Categoria categoria) {
		
		if(categoriaService.findCategoria(categoria.getId_categoria())!=null) {
			categoriaService.insertar(categoria);
		}
		else {
			System.err.println("No existo");
		}
		return "redirect:/admincate";
	}
	
	
	
	@RequestMapping(value = "/manipuleProduct", method = RequestMethod.POST, params = "Agregar")
	public String insertarProducto(@ModelAttribute Producto producto) {
		if(productoService.findProducto(producto.getId_producto())!=null) {
			System.err.println("El producto ya existe");
			return "redirect:/adminproduc";
		}
		productoService.insertar(producto);
		return "redirect:/adminproduc";
		
	}
	
	@RequestMapping(value = "/manipuleProduct", method = RequestMethod.POST, params = "Editar")
	public String editarProducto(@ModelAttribute Producto producto) {
		
		if(productoService.findProducto(producto.getId_producto())!=null) {
			productoService.insertar(producto);
		}
		else {
			System.err.println("No existo");
		}
		return "redirect:/adminproduc";
	}
	
	
	@RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.GET)
	public String eliminarProducto(@PathVariable Integer id) {
		productoService.delete(id);
		return "redirect:/adminproduc";
	}
	
	@RequestMapping(value = "/deleteCatego/{id}", method = RequestMethod.GET)
	public String eliminarCategoria(@PathVariable Integer id) {
		categoriaService.delete(id);
		return "redirect:/admincate";
	}
}
