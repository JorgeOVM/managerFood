package co.edu.ufps.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ufps.model.Direccion;
@Repository
public interface DireccionRepo extends CrudRepository<Direccion, Integer> {
	
}
