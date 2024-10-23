package co.edu.ufps.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {

	
	@Id
	private Integer id_categoria;
	
	private String nombre;
	
	@OneToMany(mappedBy = "categoria")
	private List<Producto> listaProducto;
	
	private String descripcion;

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(Integer id_categoria, String nombre, String descripcion) {
		super();
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Integer getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

	public List<Producto> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(List<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}

	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
}
