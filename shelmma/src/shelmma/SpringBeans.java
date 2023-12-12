package shelmma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import shelmma.core.driven_ports.UserRepository;
import shelmma.core.driver_ports.IUserService;
import shelmma.core.driver_ports.UserServiceImp;

@Configuration
public class SpringBeans {
	@Bean
	IUserService userService(final UserRepository userRepository) {
		return new UserServiceImp(userRepository);
	}
}