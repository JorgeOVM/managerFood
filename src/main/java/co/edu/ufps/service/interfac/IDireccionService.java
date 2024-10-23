package co.edu.ufps.service.interfac;

import java.util.List;


import co.edu.ufps.model.Direccion;

public interface IDireccionService {
	public List<Direccion> findAll();
	public void insertar(Direccion direccion);
	public Direccion findCliente(Integer direccion);
	public void delete(Integer direccion);

}
