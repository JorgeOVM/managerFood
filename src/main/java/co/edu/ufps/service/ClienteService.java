package co.edu.ufps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import co.edu.ufps.model.Cliente;
import co.edu.ufps.repository.ClienteRepo;
import co.edu.ufps.service.interfac.IClienteService;

@Service
public class ClienteService implements IClienteService{
	
	
	
	@Autowired
	private ClienteRepo clienteRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	

	@Override
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteRepo.findAll();
	}

	@Override
	public void insertar(Cliente cliente) {
		System.err.println("Antes" + cliente.getClave());
		cliente.setClave(passwordEncoder.encode(cliente.getClave()));
		System.err.println("Despues " + cliente.getClave());
		clienteRepo.save(cliente);	
	}

	@Override
	public Cliente findCliente(Integer id_cliente) {
		
		return clienteRepo.findById(id_cliente).orElse(null);
	}

	@Override
	public void delete(Integer id_cliente) {
		clienteRepo.deleteById(id_cliente);
		
	}

	@Override
	public Optional<Cliente> findByCorreo(String correo) {
		return clienteRepo.findByCorreo(correo);
	}

	@Override
	public void update(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteRepo.save(cliente);
	}

}
