package com.ashu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashu.cfg.AppConfig;
import com.ashu.services.ReportService;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReportService service = context.getBean( ReportService.class);
		service.generateReport();
	}
}
