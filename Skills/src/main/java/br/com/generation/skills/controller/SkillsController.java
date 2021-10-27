package br.com.generation.skills.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SkillsController {
	@GetMapping
	public String skill() {
		return "Persistência, mentalidade de crescimento "
				+ "e atenção aos detalhes";
	}

}
