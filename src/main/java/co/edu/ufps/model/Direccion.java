package co.edu.ufps.model;


import javax.persistence.*;

@Entity
@Table(name="direccion")
public class Direccion  {

	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_direccion;
	
	@OneToOne(mappedBy = "direccion")
	private Cliente cliente;
	
	private String descripcion;


	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Direccion(Integer id_direccion, String descripcion) {
		super();
		this.id_direccion = id_direccion;
		this.descripcion = descripcion;
	}


	public Integer getId_direccion() {
		return id_direccion;
	}


	public void setId_direccion(Integer id_direccion) {
		this.id_direccion = id_direccion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Direccion [id_direccion=" + id_direccion + ", descripcion=" + descripcion + "]";
	}


	
	
	
}
