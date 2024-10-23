package co.edu.ufps.service.interfac;

import java.util.List;


import co.edu.ufps.model.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	public void insertar(Producto producto);
	public Producto findProducto(Integer producto);
	public void delete(Integer producto);


}
