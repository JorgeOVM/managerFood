package co.edu.ufps.service.interfac;

import java.util.List;
import java.util.Optional;

import co.edu.ufps.model.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public void insertar(Cliente cliente);
	public Cliente findCliente(Integer id_cliente);
	public void delete(Integer id_cliente);
	public Optional<Cliente> findByCorreo(String correo);
	public void update(Cliente cliente);
}
