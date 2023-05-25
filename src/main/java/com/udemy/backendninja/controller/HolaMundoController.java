package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hola")
public class HolaMundoController {

	@GetMapping("holaMundo")
	public String holaMundo() {
		
		return "HolaMundo";
	}
}
