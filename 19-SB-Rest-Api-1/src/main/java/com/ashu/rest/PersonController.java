package com.ashu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.binding.Person;

@RestController
public class PersonController {
	
	@GetMapping("/person")
	public Person getPerson() {
		Person person = new Person();
		person.setName("Ashu");
		person.setAge(24);
		person.setCity("Bangalore");
		return person;
	}
}
