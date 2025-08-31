package com.ashu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashu.services.RegisterService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		RegisterService registerService = context.getBean(RegisterService.class);
		String result = registerService.registerUser(1);
		System.out.println(result);
	}
	
	

}
