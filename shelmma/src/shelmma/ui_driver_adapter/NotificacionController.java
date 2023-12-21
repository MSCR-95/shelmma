package shelmma.ui_driver_adapter;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shelmma.core.driver_ports.INotificacionService;
import shelmma.core.domain.NotificacionDoesNotExistException;
@RestController
public class NotificacionController {
	@Autowired
	private INotificacionService notificacionService;

	@GetMapping("/notificacion")
	public ResponseEntity getNotificacion(@RequestParam Long id) {
		try {
			return ResponseEntity.ok(notificacionService.getNotificacion(id));
		} catch (NotificacionDoesNotExistException e) {
			return ResponseEntity.ok("We don't have this notification!");
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
}
