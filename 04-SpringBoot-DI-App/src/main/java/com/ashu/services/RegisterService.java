package com.ashu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashu.dao.RegisterDAO;

@Service
public class RegisterService {
	
	private RegisterDAO registerDAO;
	
	@Autowired
	public RegisterService(RegisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}
	
	public String registerUser(int id) {
		return registerDAO.registerById(id);
	}
}
