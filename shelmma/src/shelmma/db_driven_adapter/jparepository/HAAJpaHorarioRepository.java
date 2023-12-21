package shelmma.db_driven_adapter.jparepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import shelmma.db_driven_adapter.domain.HorarioEntity;
import shelmma.db_driven_adapter.domain.UserEntity;

public interface HAAJpaHorarioRepository extends JpaRepository<HorarioEntity, String>{

	Optional<HorarioEntity> findByDia(String dia);	//AÑADIDO PARA CONTROLAR ERROR

	Optional<HorarioEntity> findByHorarioInicioAndHorarioFin(String horarioInicio, String horarioFin);		

	//void save(HorarioEntity horarioEntity);

	Optional<UserEntity> findById(Long id);

	HorarioEntity findByNombre(String nombre);
	

}	//AÑADIDO PARA CONTROLAR ERROR
