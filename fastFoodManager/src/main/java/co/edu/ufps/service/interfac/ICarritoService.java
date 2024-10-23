package co.edu.ufps.service.interfac;

import java.util.List;
import co.edu.ufps.model.Carrito;


public interface ICarritoService {
	public List<Carrito> findAll();
	public void insertar(Carrito carrito);
	public Carrito findCarrito(Long id_carrito);
	public void delete(Long id_carrito);


}
