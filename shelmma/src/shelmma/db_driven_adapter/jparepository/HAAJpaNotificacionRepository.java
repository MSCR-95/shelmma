package shelmma.db_driven_adapter.jparepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import shelmma.db_driven_adapter.domain.NotificacionEntity;


public interface HAAJpaNotificacionRepository extends JpaRepository<NotificacionEntity, Long>{
	Optional<NotificacionEntity> findById(long id);
	Optional<NotificacionEntity> findByNombre(String nombre);
	Optional<NotificacionEntity> findByDescripcion(String descripcion);
	Optional<NotificacionEntity> findByFecha(String fecha);
	Optional<NotificacionEntity> findByHora(String hora);
	
	
}


