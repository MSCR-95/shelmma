package shelmma.core.driver_ports;

import shelmma.core.domain.User;
import shelmma.core.driven_ports.UserRepository;

public class UserServiceImp implements IUserService {

	private UserRepository userRepository;

	public UserServiceImp(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User getUser(Long id) {
		return userRepository.findById(id);
	}

	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public void saveUser(User user) {
		userRepository.save(user);
	}

}
