package shelmma.db_driven_adapter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import shelmma.core.domain.Horario;

@Entity
@Table(name = "horarios")
public class HorarioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String dia;

    @Column(nullable = false)
    private String horarioInicio;

    @Column(nullable = false)
    private String horarioFin;

    @Column(nullable = false)
    private String nombre;
    
    public Horario toHorario(){
    	return new Horario(this.id, this.dia, this.horarioInicio, this.horarioFin, this.nombre);   
    }

    public HorarioEntity(String dia, String horarioInicio, String horarioFin, String nombre) {
        super();
    	this.dia = dia;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "HorarioEntity{" +
                "id=" + id +
                ", dia='" + dia + '\'' +
                ", horarioInicio='" + horarioInicio + '\'' +
                ", horarioFin='" + horarioFin + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }  

}
