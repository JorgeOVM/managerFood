package co.edu.ufps.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="encuesta_servicio")
public class EncuestaServicio {

	
	@Id
	private Integer id_encuesta_servicio;
	
	
	private Integer puntaje_servicio_cliente;
	
	
	private Integer puntaje_diseno;


	public EncuestaServicio() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EncuestaServicio(Integer id_encuesta_servicio, Integer puntaje_servicio_cliente, Integer puntaje_diseno) {
		super();
		this.id_encuesta_servicio = id_encuesta_servicio;
		this.puntaje_servicio_cliente = puntaje_servicio_cliente;
		this.puntaje_diseno = puntaje_diseno;
	}


	public Integer getId_encuesta_servicio() {
		return id_encuesta_servicio;
	}


	public void setId_encuesta_servicio(Integer id_encuesta_servicio) {
		this.id_encuesta_servicio = id_encuesta_servicio;
	}


	public Integer getPuntaje_servicio_cliente() {
		return puntaje_servicio_cliente;
	}


	public void setPuntaje_servicio_cliente(Integer puntaje_servicio_cliente) {
		this.puntaje_servicio_cliente = puntaje_servicio_cliente;
	}


	public Integer getPuntaje_diseno() {
		return puntaje_diseno;
	}


	public void setPuntaje_diseno(Integer puntaje_diseno) {
		this.puntaje_diseno = puntaje_diseno;
	}


	@Override
	public String toString() {
		return "EncuestaServicio [id_encuesta_servicio=" + id_encuesta_servicio + ", puntaje_servicio_cliente="
				+ puntaje_servicio_cliente + ", puntaje_diseno=" + puntaje_diseno + "]";
	}


	
	
	
}
