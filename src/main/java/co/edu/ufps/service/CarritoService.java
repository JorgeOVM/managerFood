package co.edu.ufps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.model.Carrito;
import co.edu.ufps.repository.CarritoRepo;
import co.edu.ufps.service.interfac.ICarritoService;

@Service
public class CarritoService implements ICarritoService{

	@Autowired
	private CarritoRepo carritoRepo;
	
	@Override
	public List<Carrito> findAll() {
		// TODO Auto-generated method stub
		return (List<Carrito>)carritoRepo.findAll();
	}

	@Override
	public void insertar(Carrito carrito) {
		// TODO Auto-generated method stub
		carritoRepo.save(carrito);
	}

	@Override
	public Carrito findCarrito(Long id_carrito) {
		// TODO Auto-generated method stub
		return carritoRepo.findById(id_carrito).orElse(null);
	}

	@Override
	public void delete(Long id_carrito) {
		// TODO Auto-generated method stub
		carritoRepo.deleteById(id_carrito);
		
	}

}
