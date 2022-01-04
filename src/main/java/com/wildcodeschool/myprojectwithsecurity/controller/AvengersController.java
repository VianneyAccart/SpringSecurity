package com.wildcodeschool.myprojectwithsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvengersController {

	@GetMapping("/")
	public String homepage() {
		return "Welcome to the SHIELD";
	}
	
	@GetMapping("/avengers/assemble") 
	public String avengersAssemble() {
		return "Avengers... Assemble";
	}
	
	@GetMapping("/secret-bases") 
	public String secretBases() {
		return "Lyon, La Loupe, etc...";
	}

}
