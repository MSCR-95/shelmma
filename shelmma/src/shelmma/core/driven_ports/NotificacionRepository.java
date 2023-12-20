package shelmma.core.driven_ports;
import shelmma.core.domain.Notificacion;
public interface NotificacionRepository {
	Notificacion findByNotificacionId(long id);
	Notificacion findByNotificacionNombre(String nombre);
	Notificacion findByNotificacionDescripcion(String descripcion);
	Notificacion findByNotificacionFecha(String fecha);
	Notificacion findByNotificacionHora(String hora);
	
}
