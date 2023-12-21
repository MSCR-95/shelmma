package shelmma.core.driven_ports;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import shelmma.core.domain.Tarea;

public interface TareaRepository{
    public List <Tarea> findByUserName(String user);
	public Optional<Tarea> findById(long id);
}
