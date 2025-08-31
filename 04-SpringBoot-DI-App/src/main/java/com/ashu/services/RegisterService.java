package com.ashu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ashu.dao.RegisterDAO;

@Service
public class RegisterService {
	
	@Value("${report.type}")
	private String type;
	
	private RegisterDAO registerDAO;
	
	@Autowired
	public RegisterService(RegisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}
	
	public String registerUser(int id) {
		System.out.println("Report Type: " + type);
		return registerDAO.registerById(id);
	}
}
