package shelmma.core.domain;

public class Horario {
	
	private Long id;
	private String dia;
	private String horarioInicio;
	private String horarioFin;
	private String nombre;

	public Horario(Long id2, String dia, String horarioInicio, String horarioFin, String nombre) {
		this.id = id2;
		this.dia = dia;
		this.horarioInicio = horarioInicio;
		this.horarioFin = horarioFin;
		this.nombre = nombre;
	}
	
	public Horario() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHorarioInicio() {
		return this.horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getHorarioFin() {
		return this.horarioFin;
	}

	public void setHorarioFin(String horarioFin) {
		this.horarioFin = horarioFin;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Horario{" + "dia='" + dia + '\'' + ", horarioInicio='" + horarioInicio + '\'' + ", horarioFin='"
				+ horarioFin + '\'' + ", nombre='" + nombre + '\'' + '}';
	}

}
