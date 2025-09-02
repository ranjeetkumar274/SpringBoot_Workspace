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
		
		Student s1 = new Student(101, "Ashu", 1000L, "Male", "Y");
		Student s2 = new Student(102, "Raju", 4051L, "Male", "N");
		Student s3 = new Student(103, "Asmita", 4052L, "Female", "Y");
		Student s4 = new Student(104, "Rohit", 2052L, "Male", "N");
		Student s5 = new Student(105, "Corner", 1052L, "Male", "Y");
		Student s6 = new Student(106, "Priya", 502L, "Female", "Y");
		Student s7 = new Student(107, "Ankita", 752L, "Female", "Y");


		
		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7);
		repo.saveAll(students);
		
		
//		s.setId(103);
//		s.setName("Ashmita");
//		s.setRank(4052l);
//		s.setGender("Female");
//		
//		repo.save(s);
//		System.out.println("Record is inserted....");
		
		
//		Iterable<Student> findAll = repo.findAll();;a;ws/l
//		
//		findAll.forEach(s -> System.out.println(s));
		
		
//		if(repo.existsById(103)) {
//			repo.deleteById(103);
//			System.out.println("Record is deleted....");
//		}
//		else {
//			System.out.println("Record not found for the given id...");
//		}
		
		
//		List<Student> students = repo.findByGender("Female");
//		students.forEach(System.out::println);
		
//		List<Student> studentss = repo.getStudents();
//		studentss.forEach(System.out::println);
		
//		System.out.println(repo.getClass().getName());
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the page number : ");
//		int pageNo = sc.nextInt();
//		
//		int pageSize = 3;
//		
//		Pageable pageable = PageRequest.of(pageNo -1 , 5, Sort.by("rank").ascending());
//		Page<Student> page = repo.findAll(pageable);
//		List<Student> students = page.getContent();
//		
//		students.forEach(System.out::printl€an);
//		
		
//		repo.updateStudentById(100l, 101);
		
		
//		Student s = new Student();
//		s.setGender("Male");
//		s.setRank(1000l);
//		
//		Example<Student> ex = Example.of(s);
//		List<Student> students = repo.findAll(ex);
//		
//		students.forEach(System.out::println);
		
		
	}

}
