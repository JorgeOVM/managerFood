package co.edu.ufps.service.interfac;

import java.util.List;

import co.edu.ufps.model.Categoria;

public interface ICategoriaService {
	public List<Categoria> findAll();
	public void insertar(Categoria cat);
	public Categoria findCategoria(Integer cat);
	public void delete(Integer cat);

}
