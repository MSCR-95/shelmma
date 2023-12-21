package shelmma.db_driven_adapter;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import shelmma.core.domain.Tarea;
import shelmma.core.domain.TareaDoesNotExistException;
import shelmma.core.driven_ports.TareaRepository;
import shelmma.db_driven_adapter.jparepository.HAAJpaTareaRepository;

@Component
public class JPATareaRepository implements TareaRepository {

	@Autowired // enlaza repositorio y servicio

	private HAAJpaTareaRepository haaJpaTareaRepository;

	@Override

	public List<Tarea> findByUserName(String user) {
		Optional<Tarea> TareaEntityOptional = haaJpaTareaRepository.findById(user);
		Tarea TareaEntity = TareaEntityOptional.orElseThrow(TareaDoesNotExistException::new);
		return (List<Tarea>) TareaEntity.toTarea();
	}
	@Override
	public Optional<Tarea> findById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
