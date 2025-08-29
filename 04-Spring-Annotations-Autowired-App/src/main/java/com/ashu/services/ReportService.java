package com.ashu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashu.reports.IReport;

@Service
public class ReportService {
	
	@Autowired
	private IReport report;
	
	public void generateReport() {
		report.generateReport();
	}
}
