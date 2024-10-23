package co.edu.ufps.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="encuesta_producto")
public class EncuestaProducto {

	@Id
	private Integer id_encuesta_producto;
	
	private Integer puntaje;
	
	@ManyToOne
	@JoinColumn(name = "producto")
	private Producto producto;

	public EncuestaProducto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId_encuesta_producto() {
		return id_encuesta_producto;
	}

	public void setId_encuesta_producto(Integer id_encuesta_producto) {
		this.id_encuesta_producto = id_encuesta_producto;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	
	
	
	
}
