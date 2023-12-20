package shelmma.ui_driver_adapter;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import shelmma.core.domain.Horario;
import shelmma.core.driver_ports.IHorarioService;

@RestController
public class HorarioController {

    @Autowired
    private IHorarioService horarioService;

    @GetMapping("/add")
    public String showAddForm(ModelMap model) {
        model.addAttribute("horario", new Horario());
        return "addHorario";
    }

    @PostMapping("/add")
    public String addHorario(@ModelAttribute("horario") @Valid Horario horario, BindingResult result) {
        if (result.hasErrors()) {
            return "addHorario";
        }

        // Verifica si ya existe un horario con el mismo día y nombre
        Optional<Horario> existingHorario = horarioService.findByDiaAndNombre(horario.getDia(), horario.getNombre());
        if (existingHorario.isPresent()) {
            result.rejectValue("nombre", "error.horario", "Ya existe un horario con este día y nombre");
        }

        if (result.hasErrors()) {
            return "addHorario";
        }

        // Guarda el nuevo horario en la base de datos
        horarioService.saveHorario(horario);

        return "redirect:/horario/list";
    }

    @GetMapping("/list")
    public ModelAndView listHorarios() {
        List<Horario> horarios = horarioService.getAllHorarios();
        ModelAndView modelAndView = new ModelAndView("listHorarios");
        modelAndView.addObject("horarios", horarios);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String deleteHorario(@PathVariable Long id) {
        horarioService.deleteHorarioById(id);
        return "redirect:/horario/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, ModelMap model) {
        Optional<Horario> horario = ((Object) horarioService).getHorarioById(id);
        if (horario.isPresent()) {
            model.addAttribute("horario", horario.get());
            return "editHorario";
        } else {
            return "redirect:/horario/list";
        }
    }

    @PostMapping("/edit/{id}")
    public String editHorario(@PathVariable Long id, @ModelAttribute("horario") @Valid Horario horario,
            BindingResult result) {
        if (result.hasErrors()) {
            return "editHorario";
        }

        // Verifica si ya existe un horario con el mismo día y nombre, excluyendo el horario actual
        Optional<Horario> existingHorario = (Optional<Horario>) horarioService.findByDiaAndNombreAndNotId(horario.getDia(),
                horario.getNombre(), id);
        if (existingHorario.isPresent()) {
            result.rejectValue("nombre", "error.horario", "Ya existe un horario con este día y nombre");
        }

        if (result.hasErrors()) {
            return "editHorario";
        }

        // Actualiza el horario en la base de datos
        horario.setId(id);
        horarioService.saveHorario(horario);

        return "redirect:/horario/list";
    }
}
