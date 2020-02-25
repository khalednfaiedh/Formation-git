package com.example.FormationGit.service;

import org.springframework.stereotype.Service;

import com.example.FormationGit.Model.Entity.Person;

@Service
public class PersonService {

	
	public String getName(Person p)
	{
		return p.getNom();
	}
}
