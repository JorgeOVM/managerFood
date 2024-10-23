package co.edu.ufps.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.ufps.model.Producto;

public interface ProductoRepo extends CrudRepository<Producto, Integer>{

}
