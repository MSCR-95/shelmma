package shelmma.core.driver_ports;

import shelmma.core.domain.User;

public interface IUserService {
	User getUser(Long id);

	User findByUsername(String username);

	User findByEmail(String email);

	void saveUser(User user);
}
