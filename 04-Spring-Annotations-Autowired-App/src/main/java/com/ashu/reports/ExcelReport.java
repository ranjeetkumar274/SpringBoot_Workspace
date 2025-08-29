package com.ashu.reports;

import org.springframework.stereotype.Component;

@Component
public class ExcelReport implements IReport {
	
	@Override
	public void generateReport() {
		System.out.println("Generating Excel Report");
	}
}
