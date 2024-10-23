package co.edu.ufps.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="producto")
public class Producto {

	
	@Id
	private Integer id_producto;
	
	private String nombre;
	
	private String descripcion;
	
	private Integer valor;
	@Lob
	private String img;
	
	@ManyToOne
	@JoinColumn(name="categoria ")
	private Categoria categoria;
	
	@OneToOne(mappedBy = "producto")
	private Compra compra;
	
	@OneToMany(mappedBy = "producto")
	private List<EncuestaProducto> encuestas;

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(Integer id_producto, String nombre, String descripcion, Integer valor, String img,
			Categoria categoria) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valor = valor;
		this.img = img;
		this.categoria = categoria;
	}

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
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

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", valor=" + valor + ", img=" + img + ", categoria=" + categoria + "]";
	}
	
	
	
}
