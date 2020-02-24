package com.example.FormationGit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@GetMapping("/persons")
	public String helloWorld()
	{
		return "hello world rami !!!!!";
	}

}
