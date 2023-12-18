package shelmma.core.driver_ports;

import java.util.List;
import java.util.Optional;

import shelmma.core.domain.Horario;

public interface IHorarioService {
	
	Horario getHorario(Long id);

	Horario findByHorario(String horarioInicio, String horarioFin);

	Horario findByDia(String dia);

	void saveHorario(Horario horario);

	Horario findByDiaAndNombre(String dia, String nombre);

	Object findByDiaAndNombreAndNotId(String dia, String nombre, Long id);

	void deleteHorarioById(Long id);

	List<Horario> getAllHorarios();

}
