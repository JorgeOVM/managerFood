package co.edu.ufps.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="compra")
public class Compra {
	
	
	
	@Id
	private Integer id_compra;

	private Integer cantidad;
	
	@ManyToOne
	@JoinColumn(name = "factura")
	private Factura factura;
	
	@OneToOne
	@JoinColumn(name = "producto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "cliente")
	private Cliente  cliente;
	
	
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Integer getId_compra() {
		return id_compra;
	}



	public void setId_compra(Integer id_compra) {
		this.id_compra = id_compra;
	}




	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}





	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	


}
