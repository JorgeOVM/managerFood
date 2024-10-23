package co.edu.ufps.service.interfac;

import java.util.List;

import co.edu.ufps.model.Authority;


public interface IAuthorityService {
	
	public List<Authority> findAll();
	public void insertar(Authority authority);
	public Authority findAuthority(Long id);
	public void delete(Long id);
}
