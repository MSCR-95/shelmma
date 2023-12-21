package shelmma.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import shelmma.core.domain.User;
import shelmma.core.driven_ports.UserRepository;
import shelmma.db_driven_adapter.domain.UserEntity;
import shelmma.db_driven_adapter.jparepository.HAAJpaUserRepository;

@Component
public class JPAUserRepository implements UserRepository {

	@Autowired // enlaza repositorio y servicio
	private HAAJpaUserRepository haaJpaRepository;

	@Override
	public User findById(Long id) {
		Optional<UserEntity> userEntityOptional = haaJpaRepository.findById(id);
		UserEntity userEntity = userEntityOptional.orElse(null);
		if (userEntity == null) {
			throw new RuntimeException("No existen ningún usuario con el identificador indicado");
		}
		return userEntity.toUser();
	}

	@Override
	public User findByUsername(String username) {
		//EL error creo que es porque HAAJpaUserRepository es <UserEntity, Long> y usa Long en vez de String
		Optional<UserEntity> userEntityOptional = haaJpaRepository.;
		UserEntity userEntity = userEntityOptional.orElse(null);
		if (userEntity == null) {
			throw new RuntimeException("No existen ningún usuario con el nombre especificado");
		}
		return userEntity.toUser();
		// TODO Auto-generated method stub
	}

	@Override
	public User findByEmail(String email) {
		//Igual que el anterior
		Optional<UserEntity> userEntityOptional = haaJpaRepository.;
		UserEntity userEntity = userEntityOptional.orElse(null);
		if (userEntity == null) {
			throw new RuntimeException("No existe ningun usuario con email especificado");
		}
		return userEntity.toUser();
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub

	}
}
