package co.edu.ufps.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	private String documento;
	
	private String nombre;
	
	private String apellido;
	
	private String correo;
	
	@OneToOne
	@JoinColumn(name="direccion")
	private Direccion direccion;
	
	@OneToMany(mappedBy = "cliente")
	private List<Compra>compras;
	
	
	
	private String clave;
	
	private String celular;
	
	private boolean activo;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="authorities_users",
	joinColumns=@JoinColumn(name="usuario_id"),
	inverseJoinColumns=@JoinColumn(name="authority_id"))
	private Set<Authority> authority;

	@OneToMany(mappedBy = "cliente")
	private List<Carrito>carritos;
	

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<Compra> getCompras() {
		return compras;
	}


	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}




	public boolean isActivo() {
		return activo;
	}




	public void setActivo(boolean activo) {
		this.activo = activo;
	}




	public Set<Authority> getAuthority() {
		return authority;
	}




	public void setAuthority(Set<Authority> authority) {
		this.authority = authority;
	}




	public Cliente(String documento, String nombre, String apellido, String correo, Direccion direccion, String clave,
			String celular) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
		this.clave = clave;
		this.celular = celular;
	}



	


	public List<Carrito> getCarritos() {
		return carritos;
	}


	public void setCarritos(List<Carrito> carritos) {
		this.carritos = carritos;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}	



	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	





	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	@Override
	public String toString() {
		return "Cliente [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", correo="
				+ correo + ", direccion=" + direccion + ", clave=" + clave + ", celular=" + celular + "]";
	}





	
	
	
}
