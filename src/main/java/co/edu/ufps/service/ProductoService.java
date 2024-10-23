package co.edu.ufps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.model.Producto;
import co.edu.ufps.repository.ProductoRepo;
import co.edu.ufps.service.interfac.IProductoService;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	private ProductoRepo productorepo;

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>)productorepo.findAll();
	}

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		productorepo.save(producto);
	}

	@Override
	public Producto findProducto(Integer producto) {
		// TODO Auto-generated method stub
		return productorepo.findById(producto).orElse(null);
	}

	@Override
	public void delete(Integer producto) {
		// TODO Auto-generated method stub
		productorepo.deleteById(producto);
	}

}
