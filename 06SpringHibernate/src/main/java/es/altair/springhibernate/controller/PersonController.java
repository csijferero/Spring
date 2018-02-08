package es.altair.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.altair.springhibernate.dao.PersonDAO;

@Controller
public class PersonController {

	@Autowired
	private PersonDAO personDAO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String inicio(Model model) {
		model.addAttribute("listPersons", personDAO.listPerson());
		return "principal";
	}
}
