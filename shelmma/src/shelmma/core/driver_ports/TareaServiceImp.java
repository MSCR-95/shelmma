package shelmma.core.driver_ports;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shelmma.core.domain.Tarea;
import shelmma.core.driven_ports.TareaRepository;

@Service
public class TareaServiceImp implements ITareaService {


    private TareaRepository tareaRepository;

    public TareaServiceImp(TareaRepository tareaRepository) {
		this.tareaRepository = tareaRepository;
	}

	@Override
	public Tarea getTarea(long id) {
		//return tareaRepository.getById(null);
		return null;
	}
}
