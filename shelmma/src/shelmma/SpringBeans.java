package shelmma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import shelmma.core.driven_ports.TareaRepository;
import shelmma.core.driven_ports.UserRepository;
import shelmma.core.driver_ports.ITareaService;
import shelmma.core.driver_ports.IUserService;
import shelmma.core.driver_ports.TareaServiceImp;
import shelmma.core.driver_ports.UserServiceImp;

@Configuration
public class SpringBeans {
	@Bean
	ITareaService tareaService (final TareaRepository tareaRepository) {
		return new TareaServiceImp(tareaRepository);
	}
}