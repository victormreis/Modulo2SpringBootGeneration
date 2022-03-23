package com.desafioHelloWorld.desafio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Generation!";
	}
	
	@GetMapping ("/bsm")
	public String bsm () {
		
		return "Mentalidades Generation Brasil:\n1-Orientação ao futuro\n2-Responsabilidade Pessoal\n3-mentalidade de crescimento\n4-Persistencia"
				+ "\nHabilidades:\n1-Trabalho em equipe\n2-Atençao aos detalhes\n3-Proatividade\n4-Comunicação";
				
	}
	
	@GetMapping ("/objetivos")
	public String teste() {
		return "Objetivos da semana:\nMeu principal objetivo está semana é entender melhor como funciona o Spring e conseguir aplicar todos os conceitos vistos no bloco 1 de forma eficiente!";
	}

}
