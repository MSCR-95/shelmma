package shelmma.db_driven_adapter.jparepository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import shelmma.core.domain.Tarea;
import shelmma.db_driven_adapter.domain.TareaEntity;

public interface HAAJpaTareaRepository extends JpaRepository<Tarea, String>{}

