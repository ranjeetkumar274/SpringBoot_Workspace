package com.ashu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashu.entity.Student;
import com.ashu.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository repo = context.getBean(StudentRepository.class);
		
		Student s = new Student();
		s.setId(101);
		s.setName("Ashu");
		s.setRank(4050l);
		s.setGender("Male");
		
		repo.save(s);
		System.out.println("Record is inserted....");
	}

}
