package shelmma.core.driver_ports;

import shelmma.core.domain.Notificacion;

public interface INotificacionService {
	Notificacion getNotificacion(long id);
}
