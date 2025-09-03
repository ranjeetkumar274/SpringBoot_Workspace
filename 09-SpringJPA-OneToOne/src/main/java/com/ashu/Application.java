package com.ashu;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashu.entity.Passport;
import com.ashu.entity.Person;
import com.ashu.repository.PersonRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		PersonRepository personRepo = context.getBean(PersonRepository.class);
		
		Person p = new Person();
		p.setPersonName("John Doe");
		p.setPersonEmail("John@gmail.com");
		
		Passport passport = new Passport();
		passport.setPassportNumber("A1234567");
		passport.setIssueDate(LocalDate.now());
		passport.setExpiryDate(LocalDate.now().plusYears(10));
		
		p.setPassport(passport);
		passport.setPerson(p);
		
		personRepo.save(p);
	}

}
