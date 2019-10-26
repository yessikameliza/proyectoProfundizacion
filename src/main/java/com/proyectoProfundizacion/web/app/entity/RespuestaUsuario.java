package com.proyectoProfundizacion.web.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the RESPUESTA_USUARIO database table.
 * 
 */
@Entity
@Table(name="RESPUESTA_USUARIO")
@NamedQuery(name="RespuestaUsuario.findAll", query="SELECT r FROM RespuestaUsuario r")
public class RespuestaUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RESPUESTA_USUARIO_RESPUESTAID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESPUESTA_USUARIO_RESPUESTAID_GENERATOR")
	@Column(name="RESPUESTA_ID")
	private long respuestaId;

	private String pregunta;

	private String respuesta;

	//bi-directional many-to-one association to Opcion
	@OneToMany(mappedBy="respuestaUsuario")
	private List<Opcion> opcions;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	private Usuario usuario;

	public RespuestaUsuario() {
	}

	public long getRespuestaId() {
		return this.respuestaId;
	}

	public void setRespuestaId(long respuestaId) {
		this.respuestaId = respuestaId;
	}

	public String getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public List<Opcion> getOpcions() {
		return this.opcions;
	}

	public void setOpcions(List<Opcion> opcions) {
		this.opcions = opcions;
	}

	public Opcion addOpcion(Opcion opcion) {
		getOpcions().add(opcion);
		opcion.setRespuestaUsuario(this);

		return opcion;
	}

	public Opcion removeOpcion(Opcion opcion) {
		getOpcions().remove(opcion);
		opcion.setRespuestaUsuario(null);

		return opcion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}