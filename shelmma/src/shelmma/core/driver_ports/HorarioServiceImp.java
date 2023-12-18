package shelmma.core.driver_ports;

import java.util.List;

import shelmma.core.domain.Horario;
import shelmma.core.domain.User;
import shelmma.core.driven_ports.HorarioRepository;

public class HorarioServiceImp implements IHorarioService{
	
	private HorarioRepository horarioRepository;

	public HorarioServiceImp(HorarioRepository horarioRepository) {
		this.horarioRepository = horarioRepository;
	}

	public Horario getHorario(Long id) {
		return horarioRepository.findById(id);
	}

	public Horario findByName(String name) {
		return horarioRepository.findByNombre(name);
	}

	public Horario findByHorario(String horarioInicio, String horarioFin) {
		return horarioRepository.findByHorarioInicioAndHorarioFin(horarioInicio, horarioFin);
	}
	
	public Horario findByDia(String dia) {
		return horarioRepository.findByDia(dia);
	}

	public void saveHorario(Horario horario) {
		horarioRepository.save(horario);
	}

	@Override
    public Horario findByDiaAndNombre(String dia, String nombre) {
        return horarioRepository.findByDiaAndNombre(dia, nombre);
    }

    @Override
    public Horario findByDiaAndNombreAndNotId(String dia, String nombre, Long id) {
        return horarioRepository.findByDiaAndNombreAndIdNot(dia, nombre, id);
    }

    @Override
    public void deleteHorarioById(Long id) {
        horarioRepository.deleteById(id);
    }

	@Override
	public List<Horario> getAllHorarios() {
		return null;
	}


}
