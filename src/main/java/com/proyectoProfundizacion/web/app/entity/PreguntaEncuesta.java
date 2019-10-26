package com.proyectoProfundizacion.web.app.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PREGUNTA_ENCUESTA database table.
 * 
 */
@Entity
@Table(name="PREGUNTA_ENCUESTA")
@NamedQuery(name="PreguntaEncuesta.findAll", query="SELECT p FROM PreguntaEncuesta p")
public class PreguntaEncuesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PREGUNTA_ENCUESTA_PREGUNTAENCID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PREGUNTA_ENCUESTA_PREGUNTAENCID_GENERATOR")
	@Column(name="PREGUNTA_ENC_ID")
	private long preguntaEncId;

	//bi-directional many-to-one association to Encuesta
	@ManyToOne(fetch=FetchType.LAZY)
	private Encuesta encuesta;

	//bi-directional many-to-one association to Opcion
	@ManyToOne(fetch=FetchType.LAZY)
	private Opcion opcion;

	//bi-directional many-to-one association to Pregunta
	@ManyToOne(fetch=FetchType.LAZY)
	private Pregunta pregunta;

	public PreguntaEncuesta() {
	}

	public long getPreguntaEncId() {
		return this.preguntaEncId;
	}

	public void setPreguntaEncId(long preguntaEncId) {
		this.preguntaEncId = preguntaEncId;
	}

	public Encuesta getEncuesta() {
		return this.encuesta;
	}

	public void setEncuesta(Encuesta encuesta) {
		this.encuesta = encuesta;
	}

	public Opcion getOpcion() {
		return this.opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}

	public Pregunta getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

}