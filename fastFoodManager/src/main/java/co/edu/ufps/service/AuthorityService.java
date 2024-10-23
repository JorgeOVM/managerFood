package co.edu.ufps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.model.Authority;
import co.edu.ufps.repository.AuthorityRepo;
import co.edu.ufps.service.interfac.IAuthorityService;

@Service
public class AuthorityService implements IAuthorityService{
	
	@Autowired
	private AuthorityRepo authorityrepo;

	@Override
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return (List<Authority>)authorityrepo.findAll();
	}

	@Override
	public void insertar(Authority authority) {
		// TODO Auto-generated method stub
		authorityrepo.save(authority);
		
	}

	@Override
	public Authority findAuthority(Long id) {
		// TODO Auto-generated method stub
		return authorityrepo.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		authorityrepo.deleteById(id);
		
	}

}
