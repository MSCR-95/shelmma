package shelmma.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import shelmma.core.domain.Notificacion;
import shelmma.core.domain.NotificacionDoesNotExistException;
import shelmma.db_driven_adapter.domain.NotificacionEntity;
import shelmma.db_driven_adapter.jparepository.HAAJpaNotificacionRepository;
import shelmma.core.domain.Notificacion;
import shelmma.core.driven_ports.NotificacionRepository;

@Component
public class JPANotificacionRepository implements NotificacionRepository{
	@Autowired // enlaza repositorio y servicio
	private HAAJpaNotificacionRepository haaJpaRepository;
	
	@Override
	public Notificacion findByNotificacionId(long id) {
		Optional<NotificacionEntity> notificacionEntityOption=haaJpaRepository.findById(id);
		NotificacionEntity notificacionEntity=notificacionEntityOption.orElseThrow(NotificacionDoesNotExistException::new);
		return notificacionEntity.toNotificacion();
		
	}
	
	@Override
	public Notificacion findByNotificacionNombre(String nombre) {
		Optional<NotificacionEntity> notificacionEntityOption=haaJpaRepository.findByNombre(nombre);
		NotificacionEntity notificacionEntity=notificacionEntityOption.orElseThrow(NotificacionDoesNotExistException::new);
		return notificacionEntity.toNotificacion();
	}

	@Override
	public Notificacion findByNotificacionDescripcion(String descripcion) {
		Optional<NotificacionEntity> notificacionEntityOption=haaJpaRepository.findByDescripcion(descripcion);
		NotificacionEntity notificacionEntity=notificacionEntityOption.orElseThrow(NotificacionDoesNotExistException::new);
		return notificacionEntity.toNotificacion();
		
	}

	@Override
	public Notificacion findByNotificacionFecha(String fecha) {
		Optional<NotificacionEntity> notificacionEntityOption=haaJpaRepository.findByFecha(fecha);
		NotificacionEntity notificacionEntity=notificacionEntityOption.orElseThrow(NotificacionDoesNotExistException::new);
		return notificacionEntity.toNotificacion();
		
	}

	@Override
	public Notificacion findByNotificacionHora(String hora) {
		Optional<NotificacionEntity> notificacionEntityOption=haaJpaRepository.findByHora(hora);
		NotificacionEntity notificacionEntity=notificacionEntityOption.orElseThrow(NotificacionDoesNotExistException::new);
		return notificacionEntity.toNotificacion();
		
	}

	
		

}
