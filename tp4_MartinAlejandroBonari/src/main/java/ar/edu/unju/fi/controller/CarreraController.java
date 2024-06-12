package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ar.edu.unju.fi.collections.CarreraCollection;

@Controller
@RequestMapping("/carrera")
public class CarreraController {
	@GetMapping("/listado")
	public String getCarrerasPage(Model model) {
		model.addAttribute("carreras", CarreraCollection.getCarreras());
		model.addAttribute("titulo", "Carreras");
		return "carreras";
	}
}
