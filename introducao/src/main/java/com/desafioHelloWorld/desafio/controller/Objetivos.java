package com.desafioHelloWorld.desafio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos")
public class Objetivos {

	@GetMapping
	public String teste() {
		return "Objetivos da semana:\nMeu principal objetivo está semana é entender melhor como funciona o Spring e conseguir aplicar todos os conceitos vistos no bloco 1 de forma eficiente!";
	}
}
