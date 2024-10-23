package co.edu.ufps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.model.Direccion;
import co.edu.ufps.repository.DireccionRepo;
import co.edu.ufps.service.interfac.IDireccionService;

@Service
public class DireccionService implements IDireccionService{

	
	@Autowired
	private DireccionRepo direccionr;
	
	@Override
	public List<Direccion> findAll() {
		// TODO Auto-generated method stub
		return (List<Direccion>)direccionr.findAll();
	}

	@Override
	public void insertar(Direccion direccion) {
		// TODO Auto-generated method stub
		direccionr.save(direccion);
	}

	@Override
	public Direccion findCliente(Integer direccion) {
		// TODO Auto-generated method stub
		return direccionr.findById(direccion).orElse(null);
	}

	@Override
	public void delete(Integer direccion) {
		// TODO Auto-generated method stub
		direccionr.deleteById(direccion);
		
	}

}
