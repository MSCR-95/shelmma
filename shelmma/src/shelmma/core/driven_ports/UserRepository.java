package shelmma.core.driven_ports;

import shelmma.core.domain.User;

/*
 * Un driven port (puertos controlados) es una interfaz para una funcionalidad que necesita
 *  la aplicación para implementar la lógica empresarial. Tal funcionalidad es proporcionada 
 *  por un driven actor (actor controlado). Por lo tanto, los driven ports son la SPI 
 *  (Interfaz de proveedor de servicios) requerida por la aplicación.
 */

public interface UserRepository {
	User findById(Long id);

	User findByUsername(String username);

	User findByEmail(String email);

	void save(User user);
}
