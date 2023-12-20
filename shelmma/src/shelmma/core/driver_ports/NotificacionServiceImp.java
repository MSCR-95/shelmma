package shelmma.core.driver_ports;

import shelmma.core.driven_ports.NotificacionRepository;
import shelmma.core.domain.Notificacion;

public class NotificacionServiceImp implements INotificacionService{
	private NotificacionRepository notificacionRepository; 
	@Override
	public Notificacion getNotificacion(long id) {
		
		return notificacionRepository.findByNotificacionId(id);
	}
	
	public NotificacionServiceImp(NotificacionRepository notificacionRepository) {
		this.notificacionRepository=notificacionRepository;
		
	}

}
