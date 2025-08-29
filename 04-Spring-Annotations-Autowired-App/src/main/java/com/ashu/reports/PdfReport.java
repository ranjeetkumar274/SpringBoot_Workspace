package com.ashu.reports;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PdfReport implements IReport {
	
	@Override
	public void generateReport() {
		System.out.println("Generating PDF Report");
	}
}
