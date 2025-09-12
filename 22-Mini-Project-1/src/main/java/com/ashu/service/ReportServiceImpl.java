package com.ashu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.ashu.entities.CitizenPlanInfo;
import com.ashu.repos.CitizenPlanInfoRepo;
import com.ashu.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {
	
	
	@Autowired
	private CitizenPlanInfoRepo repo;

	@Override
	public List<String> getPlanNames() {
		return repo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatus() {
		return repo.getPlanStatus();
	}
	
	@Override
	public List<CitizenPlanInfo> search(SearchRequest request) {
		
		CitizenPlanInfo example = new CitizenPlanInfo();
		
		if(request.getPlanName() != null && !request.getPlanName().isEmpty()) {
			example.setPlanName(request.getPlanName());
		}
		
		if(request.getPlanStatus() != null && !request.getPlanStatus().isEmpty()) {
			example.setPlanStatus(request.getPlanStatus());
		}
		
		if(request.getGender() != null && !request.getGender().isEmpty()) {
			example.setGender(request.getGender());
		}
		
		if(request.getStartDate() != null ) {
			example.setPlanStartDate(request.getStartDate());
		}
		
		if(request.getEndDate() != null ) {
			example.setPlanEndDate(request.getEndDate());
		}
		
		
		return repo.findAll(Example.of(example));
	}

	@Override
	public boolean generateExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean generatePdf() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
