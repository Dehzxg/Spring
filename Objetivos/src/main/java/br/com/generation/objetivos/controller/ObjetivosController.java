package br.com.generation.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ObjetivosController {
	@GetMapping
	public String Objetivos() {
		return "Objetivos de aprendizagem para essa semana:"
				+ "\n Atenção aos detalhes;"
				+ "\n Apronfudar conhecimento em ReactJS e ReactNative;"
				+ "\n Tirar mais dúvidas;";
		
	}

}
