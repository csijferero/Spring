package es.altair.sesionesmongodb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import es.altair.sesionesmongodb.bean.Usuario;

@Controller
@SessionAttributes("usu")
public class UsuarioController {
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String inicio(@ModelAttribute("usuario") Usuario usu, Model m) {
		System.out.println(usu.getNombre());
		m.addAttribute(usu);
		return "principal";
	}
}
