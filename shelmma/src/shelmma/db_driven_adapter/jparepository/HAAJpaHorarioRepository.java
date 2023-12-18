package shelmma.db_driven_adapter.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import shelmma.db_driven_adapter.domain.HorarioEntity;

public interface HAAJpaHorarioRepository extends JpaRepository<HorarioEntity, String>{}
