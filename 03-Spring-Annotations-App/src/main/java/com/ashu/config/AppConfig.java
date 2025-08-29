package com.ashu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ashu")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig object created");
	}
}
