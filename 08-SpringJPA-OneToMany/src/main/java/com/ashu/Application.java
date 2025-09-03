package com.ashu;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashu.entity.Address;
import com.ashu.entity.Employee;
import com.ashu.repository.AddressRepository;
import com.ashu.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepository empRepo = context.getBean(EmployeeRepository.class);
		
		AddressRepository addRepo = context.getBean(AddressRepository.class);
		
		Employee e1 = new Employee();
		e1.setEmpName("Ashu");
		e1.setEmpSalary(45000.00);
		
		Address a1 = new Address();
		a1.setHouseNo(101);
		a1.setCity("Pune");
		a1.setState("MH");
		a1.setCountry("India");
		a1.setEmployee(e1);
		
		Address a2 = new Address();
		a2.setHouseNo(102);
		a2.setCity("Mumbai");
		a2.setState("MH");
		a2.setCountry("India");
		a2.setEmployee(e1);
		
		
		e1.setEmpAdd(Arrays.asList(a1, a2));
		empRepo.save(e1);
		
//		empRepo.deleteById(5);
//		empRepo.deleteById(2);
//		empRepo.deleteById(3);
//		empRepo.deleteById(4);
		
	
	
	}

}
