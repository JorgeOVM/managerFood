package co.edu.ufps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.model.Categoria;
import co.edu.ufps.repository.CategoriaRepo;
import co.edu.ufps.service.interfac.ICategoriaService;

@Service
public class CategoriaService implements ICategoriaService{
	
	@Autowired
	private CategoriaRepo categoRepo;

	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>)categoRepo.findAll();
	}

	@Override
	public void insertar(Categoria cat) {
		// TODO Auto-generated method stub
		categoRepo.save(cat);
		
	}

	@Override
	public Categoria findCategoria(Integer cat) {
		// TODO Auto-generated method stub
		return categoRepo.findById(cat).orElse(null);
	}

	@Override
	public void delete(Integer cat) {
		// TODO Auto-generated method stub
		categoRepo.deleteById(cat);
		
	}
	
	

}
