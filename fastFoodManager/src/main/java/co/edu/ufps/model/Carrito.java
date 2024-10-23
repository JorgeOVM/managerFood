package co.edu.ufps.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="producto_carrito",
	joinColumns=@JoinColumn(name="carrito_id"),
	inverseJoinColumns=@JoinColumn(name="producto_id"))
	private List<Producto>productos;
	
	@ManyToOne
	private Cliente cliente;
	

	private boolean activo;
	
	public Carrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carrito(Long id, List<Producto> productos, Cliente cliente) {
		super();
		this.id = id;
		this.productos = productos;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Carrito [id=" + id + ", productos=" + productos + ", cliente=" + cliente + ", activo=" + activo + "]";
	}
	
	

	
}
