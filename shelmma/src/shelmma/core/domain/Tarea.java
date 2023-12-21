package shelmma.core.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Tarea {

    private long id;
    private String userName;
    private String description;
    private String Nombre;
    private String Notas;
    private Date targetDate;
    private Date fechaFin;
    private boolean isDone;
    
    public Tarea() {
        super();
    }

    public Tarea(String user, String Nombre, String desc, String Notas, Date targetDate, Date fechaFin, boolean isDone) {
        
    	super();
        this.userName = user;
        this.Nombre=Nombre;
        this.description = desc;
        this.targetDate = targetDate;
        this.fechaFin=fechaFin;
        this.Notas = Notas; 
        this.isDone=isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public String getNotas() {
        return Notas;
    }

    public void setNotas(String Notas) {
        this.Notas = Notas;
    }
    public Tarea toTarea() {
    	return new Tarea(this.userName, this.Nombre, this.description, this.Notas, this.targetDate, this.fechaFin, this.isDone);
    }
    
}
