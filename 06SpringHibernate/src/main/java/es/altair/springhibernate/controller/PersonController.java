package es.altair.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import es.altair.springhibernate.bean.Person;
import es.altair.springhibernate.dao.PersonDAO;

@Controller
public class PersonController {

	@Autowired
	private PersonDAO personDAO;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String inicio(Model model, 
			@ModelAttribute("persona") final Person mappingPersona) {
		if (mappingPersona != null)
			model.addAttribute("person", mappingPersona);
		else
			model.addAttribute("person", new Person());
		
		model.addAttribute("listPersons", personDAO.listPerson());
		return "principal";
	}
	
	@RequestMapping(value="/addedit", method = RequestMethod.POST)
	public String addEditPerson(@ModelAttribute Person p) {
		if (p.getId() == 0)
			personDAO.addPerson(p);
		else
			personDAO.editPerson(p);
		return "redirect:/";
	}
	
	@RequestMapping(value="/edit/{idPerson}")
	public String editPerson(@PathVariable("idPerson")int id, 
			final RedirectAttributes redirectAttributes) {
		Person p = personDAO.getPersonById(id);
			
		//model.addAttribute("person", p);
		//model.addAttribute("listPersons", personDAO.listPersons());
		
		//return "principal";
		
		redirectAttributes.addFlashAttribute("persona", p);
		
		return "redirect:/";
		
	}
	
	@RequestMapping(value="/delete/{idPerson}")
	public String deletePerson(@PathVariable("idPerson")int id) {
		personDAO.deletePerson(id);
		return "redirect:/";
	}
}