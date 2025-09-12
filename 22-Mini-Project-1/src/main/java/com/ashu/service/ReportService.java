package com.ashu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashu.entities.CitizenPlanInfo;
import com.ashu.request.SearchRequest;

@Service
public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlanInfo> search(SearchRequest request);
	
	public boolean generateExcel();
	
	public boolean generatePdf();
	
}
