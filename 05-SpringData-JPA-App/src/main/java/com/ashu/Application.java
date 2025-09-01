package com.ashu;

import java.util.Arrays;
import java.util.List;

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
		
//		Student s1 = new Student(103, "Asmita", 4052l, "Female");
//		Student s2 = new Student(104, "Rohit", 2052l, "Male");
//		Student s3 = new Student(105, "Corner", 1052l, "Male");
//		Student s4 = new Student(106, "Priya", 502l, "Female");
//		Student s5 = new Student(107, "Ankita", 752l, "Female");
//		
//		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
//		repo.saveAll(students);
		
		
//		s.setId(103);
//		s.setName("Ashmita");
//		s.setRank(4052l);
//		s.setGender("Female");
//		
//		repo.save(s);
//		System.out.println("Record is inserted....");
		
		
//		Iterable<Student> findAll = repo.findAll();
//		
//		findAll.forEach(s -> System.out.println(s));
		
		
//		if(repo.existsById(103)) {
//			repo.deleteById(103);
//			System.out.println("Record is deleted....");
//		}
//		else {
//			System.out.println("Record not found for the given id...");
//		}
		
		
		List<Student> students = repo.findByGender("Female");
		students.forEach(System.out::println);
		
		
		
		
	}

}
