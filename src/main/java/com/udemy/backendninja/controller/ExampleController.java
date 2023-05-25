package com.udemy.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String VISTA= "ejemplo";

	//Primera forma
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("personas", listaPersonas());
		return VISTA;
	}
	
	//Segunda forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAAV() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("personas", listaPersonas());
		mav.setViewName(VISTA);
		return mav;
	}
	
	public List<Person> listaPersonas(){
		
		List<Person> personas = new ArrayList<>();
		personas.add(new Person("David", 36));
		personas.add(new Person("Pepe", 30));
		personas.add(new Person("Juan", 20));
		personas.add(new Person("Pablo", 15));
		
		return personas;
	}
}
