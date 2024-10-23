package co.edu.ufps.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adicional")
public class Adicional {

	@Id
	private Integer id_adicional;
	
	private String nombre;

	public Adicional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adicional(Integer id_adicional, String nombre) {
		super();
		this.id_adicional = id_adicional;
		this.nombre = nombre;
	}

	public Integer getId_adicional() {
		return id_adicional;
	}

	public void setId_adicional(Integer id_adicional) {
		this.id_adicional = id_adicional;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Adicional [id_adicional=" + id_adicional + ", nombre=" + nombre + "]";
	}

	

	
	
}
