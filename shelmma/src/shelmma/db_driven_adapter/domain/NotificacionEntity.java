package shelmma.db_driven_adapter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import shelmma.core.domain.Notificacion;

@Entity
@Table(name="notificacion")
public class NotificacionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique = true, nullable = false)
	private String nombre;
	@Column(unique = true, nullable = false)
	private String descripcion;
	@Column(unique = true, nullable = false)
	private String fecha;
	@Column(unique = true, nullable = false)
	private String hora;
	
	public Notificacion toNotificacion() {
		return new Notificacion(id, nombre, descripcion, fecha, hora);
	}
	
	public NotificacionEntity(long id, String nombre, String descripcion, String fecha, String hora) {
		this.id=id;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.fecha=fecha;
		this.hora=hora;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
