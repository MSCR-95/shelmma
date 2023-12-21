package shelmma.db_driven_adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import shelmma.core.domain.Horario;
import shelmma.core.domain.User;
import shelmma.core.driven_ports.HorarioRepository;
import shelmma.db_driven_adapter.domain.HorarioEntity;
import shelmma.db_driven_adapter.domain.UserEntity;
import shelmma.db_driven_adapter.jparepository.HAAJpaHorarioRepository;

public class JPAHorarioRepository implements HorarioRepository {

	@Autowired
    private HAAJpaHorarioRepository haaJpaRepository;

    @Override
    public Horario findByDia(String dia) {
    	Optional<HorarioEntity> horarioEntityOptional = haaJpaRepository.findByDia(dia);
		HorarioEntity horarioEntity = horarioEntityOptional.orElse(null);
		if (horarioEntity == null) {
			throw new RuntimeException("El dia seleccionado no existe");
		}
		return horarioEntity.toHorario();
    }

    @Override
    public Horario findByHorarioInicioAndHorarioFin(String horarioInicio, String horarioFin) {
    	Optional<HorarioEntity> horarioEntityOptional = haaJpaRepository.findByHorarioInicioAndHorarioFin(horarioInicio, horarioFin);
		HorarioEntity horarioEntity = horarioEntityOptional.orElse(null);
		if (horarioEntity == null) {
			throw new RuntimeException("El horario no existe");
		}
		return horarioEntity.toHorario();
    }

    @Override
    public Horario findByNombre(String nombre) {
        HorarioEntity horarioEntityOptional = haaJpaRepository.findByNombre(nombre);
        HorarioEntity horarioEntity = horarioEntityOptional.orElse(null);
        if (horarioEntity == null) {
            throw new RuntimeException("El nombre no existe");
        }
        return horarioEntity.toHorario();
    }

    @Override
    public void save(Horario horario) {
        haaJpaRepository.save(new HorarioEntity(horario));
    }

    //tenemos que añadir un horario al usuario, o relacionarlos por alguna clave
	@Override
	public Horario findById(Long id) {
		Optional<UserEntity> userEntityOptional = haaJpaRepository.findById(id);
		UserEntity userEntity = userEntityOptional.orElse(null);
		if (userEntity == null) {
			throw new RuntimeException("El id del horario no existe");
		}
		
		//return horarioEntity.toHorario();
		return null;
	}
//AÑADIDO
	@Override
	public Horario findByDiaAndNombre(String dia, String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Horario findByDiaAndNombreAndIdNot(String dia, String nombre, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
//AÑADIDO
}
