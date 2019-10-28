package com.proyectoProfundizacion.web.app.entity;



import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ENCUESTA database table.
 * 
 */
@Entity
@NamedQuery(name="Encuesta.findAll", query="SELECT e FROM Encuesta e")
public class Encuesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ENCU_ENCUID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ENCU_ENCUID_GENERATOR")
	@Column(name="ENCUESTA_ID")
	private long encuestaId;

	private BigDecimal cantperson;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_FIN")
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;

	private String genero;

	private String nombre;

	private String objetivo;

	private String tipo;

	//bi-directional many-to-one association to Gruposenc
	@ManyToOne(fetch=FetchType.LAZY)
	private Gruposenc gruposenc;

	//bi-directional many-to-one association to EncuestaUsuario
	@OneToMany(mappedBy="encuesta")
	private List<EncuestaUsuario> encuestaUsuarios;

	//bi-directional many-to-one association to PreguntaEncuesta
	@OneToMany(mappedBy="encuesta")
	private List<PreguntaEncuesta> preguntaEncuestas;

	//bi-directional many-to-one association to RangoEdadobjetivo
	@OneToMany(mappedBy="encuesta")
	private List<RangoEdadobjetivo> rangoEdadobjetivos;

	//bi-directional many-to-one association to TemasintEncuesta
	@OneToMany(mappedBy="encuesta")
	private List<TemasintEncuesta> temasintEncuestas;

	public Encuesta() {
	}

	public long getEncuestaId() {
		return this.encuestaId;
	}

	public void setEncuestaId(long encuestaId) {
		this.encuestaId = encuestaId;
	}

	public BigDecimal getCantperson() {
		return this.cantperson;
	}

	public void setCantperson(BigDecimal cantperson) {
		this.cantperson = cantperson;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObjetivo() {
		return this.objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Gruposenc getGruposenc() {
		return this.gruposenc;
	}

	public void setGruposenc(Gruposenc gruposenc) {
		this.gruposenc = gruposenc;
	}

	public List<EncuestaUsuario> getEncuestaUsuarios() {
		return this.encuestaUsuarios;
	}

	public void setEncuestaUsuarios(List<EncuestaUsuario> encuestaUsuarios) {
		this.encuestaUsuarios = encuestaUsuarios;
	}

	public EncuestaUsuario addEncuestaUsuario(EncuestaUsuario encuestaUsuario) {
		getEncuestaUsuarios().add(encuestaUsuario);
		encuestaUsuario.setEncuesta(this);

		return encuestaUsuario;
	}

	public EncuestaUsuario removeEncuestaUsuario(EncuestaUsuario encuestaUsuario) {
		getEncuestaUsuarios().remove(encuestaUsuario);
		encuestaUsuario.setEncuesta(null);

		return encuestaUsuario;
	}

	public List<PreguntaEncuesta> getPreguntaEncuestas() {
		return this.preguntaEncuestas;
	}

	public void setPreguntaEncuestas(List<PreguntaEncuesta> preguntaEncuestas) {
		this.preguntaEncuestas = preguntaEncuestas;
	}

	public PreguntaEncuesta addPreguntaEncuesta(PreguntaEncuesta preguntaEncuesta) {
		getPreguntaEncuestas().add(preguntaEncuesta);
		preguntaEncuesta.setEncuesta(this);

		return preguntaEncuesta;
	}

	public PreguntaEncuesta removePreguntaEncuesta(PreguntaEncuesta preguntaEncuesta) {
		getPreguntaEncuestas().remove(preguntaEncuesta);
		preguntaEncuesta.setEncuesta(null);

		return preguntaEncuesta;
	}

	public List<RangoEdadobjetivo> getRangoEdadobjetivos() {
		return this.rangoEdadobjetivos;
	}

	public void setRangoEdadobjetivos(List<RangoEdadobjetivo> rangoEdadobjetivos) {
		this.rangoEdadobjetivos = rangoEdadobjetivos;
	}

	public RangoEdadobjetivo addRangoEdadobjetivo(RangoEdadobjetivo rangoEdadobjetivo) {
		getRangoEdadobjetivos().add(rangoEdadobjetivo);
		rangoEdadobjetivo.setEncuesta(this);

		return rangoEdadobjetivo;
	}

	public RangoEdadobjetivo removeRangoEdadobjetivo(RangoEdadobjetivo rangoEdadobjetivo) {
		getRangoEdadobjetivos().remove(rangoEdadobjetivo);
		rangoEdadobjetivo.setEncuesta(null);

		return rangoEdadobjetivo;
	}

	public List<TemasintEncuesta> getTemasintEncuestas() {
		return this.temasintEncuestas;
	}

	public void setTemasintEncuestas(List<TemasintEncuesta> temasintEncuestas) {
		this.temasintEncuestas = temasintEncuestas;
	}

	public TemasintEncuesta addTemasintEncuesta(TemasintEncuesta temasintEncuesta) {
		getTemasintEncuestas().add(temasintEncuesta);
		temasintEncuesta.setEncuesta(this);

		return temasintEncuesta;
	}

	public TemasintEncuesta removeTemasintEncuesta(TemasintEncuesta temasintEncuesta) {
		getTemasintEncuestas().remove(temasintEncuesta);
		temasintEncuesta.setEncuesta(null);

		return temasintEncuesta;
	}

}