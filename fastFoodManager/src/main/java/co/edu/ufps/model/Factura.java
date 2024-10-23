package co.edu.ufps.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="factura")
public class Factura {
	
	@Id
	private Integer id_factura;	
	
	
	@OneToMany(mappedBy = "factura")
	private List<Compra> listaCompra;
	
	private Integer total;	

	private Date fecha;	
	
	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId_factura() {
		return id_factura;
	}

	public void setId_factura(Integer id_factura) {
		this.id_factura = id_factura;
	}

	public List<Compra> getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(List<Compra> listaCompra) {
		this.listaCompra = listaCompra;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Factura [id_factura=" + id_factura + ", listaCompra=" + listaCompra + ", total=" + total + ", fecha="
				+ fecha + "]";
	}
	
	
	
}
