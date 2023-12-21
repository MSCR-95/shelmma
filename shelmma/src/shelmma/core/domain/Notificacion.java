package shelmma.core.domain;

public class Notificacion {
	private long id;
	private String nombreTarea;
	private String descripcion;
	private String fecha;
	private String hora;
	public Notificacion(long id, String nombreTarea, String descripcion, String fecha, String hora) {
		this.id=id;
		this.nombreTarea=nombreTarea;
		this.descripcion=descripcion;
		this.fecha=fecha;
		this.hora=hora;
		
	}
	public Notificacion() {
		super();
	}
	public String getNombreTarea() {
		return nombreTarea;
	}
	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
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
