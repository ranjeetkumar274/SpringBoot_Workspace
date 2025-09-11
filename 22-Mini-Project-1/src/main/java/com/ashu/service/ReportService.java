package com.ashu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashu.entities.CitizenPlanInfo;

@Service
public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlanInfo> search(CitizenPlanInfo citizenPlanInfo);
	
	public boolean generateExcel();
	
	public boolean generatePdf();
	
}
