package com.ashu.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.binding.Person;

@RestController
public class PersonController {
	
	@GetMapping(
			value="/person",
			produces= {"application/xml","application/json"}
			)
	public Person getPerson() {
		Person person = new Person();
		person.setName("Ashu");
		person.setAge(24);
		person.setCity("Noida");
		return person;
	}
	
	@PostMapping(
			value="/person",
			consumes= {"application/xml", "application/json"},
			produces= {"text/plain"}
			)
	public ResponseEntity<String> savePerson(@RequestBody Person person){
		System.out.println(person);
		return new ResponseEntity<>("Person Saved!", HttpStatus.CREATED);
	}
}
