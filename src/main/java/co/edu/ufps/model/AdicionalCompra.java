package co.edu.ufps.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="compra_adicional")
public class AdicionalCompra {
	
	
	@Id
	private Integer compra_idcompra;
	
	private Integer adicionales_idadicionales;

	public AdicionalCompra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdicionalCompra(Integer compra_idcompra, Integer adicionales_idadicionales) {
		
		this.compra_idcompra = compra_idcompra;
		this.adicionales_idadicionales = adicionales_idadicionales;
	}

	public Integer getCompra_idcompra() {
		return compra_idcompra;
	}

	public void setCompra_idcompra(Integer compra_idcompra) {
		this.compra_idcompra = compra_idcompra;
	}

	public Integer getAdicionales_idadicionales() {
		return adicionales_idadicionales;
	}

	public void setAdicionales_idadicionales(Integer adicionales_idadicionales) {
		this.adicionales_idadicionales = adicionales_idadicionales;
	}

	@Override
	public String toString() {
		return "AdicionalCompra [compra_idcompra=" + compra_idcompra + ", adicionales_idadicionales="
				+ adicionales_idadicionales + "]";
	}

	

	
	
	
}
