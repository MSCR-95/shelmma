package shelmma.core.driven_ports;

import java.util.List;

import shelmma.core.domain.Horario;
import shelmma.core.domain.User;

public interface HorarioRepository {
	
	Horario findById(Long id);

	Horario findByDia(String dia);

    Horario findByHorarioInicioAndHorarioFin(String horarioInicio, String horarioFin);

    Horario findByNombre(String nombre);

    void save(Horario horario);

	Horario findByDiaAndNombre(String dia, String nombre);

	Horario findByDiaAndNombreAndIdNot(String dia, String nombre, Long id);

	void deleteById(Long id);
	
}
