package shelmma.ui_driver_adapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shelmma.core.domain.User;
import shelmma.core.driver_ports.IUserService;
import shelmma.core.driver_ports.UserServiceImp;

@RestController
public class UserController {

	/*
	 * 
	@RestController
	public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public ResponseEntity getBook(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(bookService.getBook(id));
        } catch (BookDoesNotExistException e){
            return ResponseEntity.ok("We don't have this book!");
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
	 */
	//private UserServiceImp userService;
	/*
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request,
        HttpServletResponse response) {

        Authentication authentication = SecurityContextHolder.getContext()
            .getAuthentication();

        if (authentication != null) {
            new SecurityContextLogoutHandler().logout(request, response,
                authentication);
        }

        return "redirect:/";
    }
	*/
	@GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
	
	@Autowired
    private IUserService userService;

    @GetMapping("/signup")
    public String showSignupForm(ModelMap model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute("user") @Validated User user, BindingResult result) {
        if (result.hasErrors()) {
            return "signup";
        }

        // Verifica si el nombre de usuario y el correo electrónico ya existen
        if (userService.findByUsername(user.getUsername()).isPresent()) {
            result.rejectValue("username", "error.user", "Ya existe un usuario con este nombre de usuario");
        }
        if (userService.findByEmail(user.getEmail()).isPresent()) {
            result.rejectValue("email", "error.user", "Ya existe un usuario con este correo electrónico");
        }

        if (result.hasErrors()) {
            return "signup";
        }

        // Hashea la contraseña antes de almacenarla en la base de datos (deberías usar una técnica segura)
        //user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setPassword(user.getPassword());

        // Guarda el nuevo usuario en la base de datos
        userService.saveUser(user);

        return "redirect:/login";
    }
}
