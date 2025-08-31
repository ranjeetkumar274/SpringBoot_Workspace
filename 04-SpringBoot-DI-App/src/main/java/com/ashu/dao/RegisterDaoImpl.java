package com.ashu.dao;

import org.springframework.stereotype.Repository;

@Repository
public class RegisterDaoImpl implements RegisterDAO {
	
	@Override
	public String registerById(int id) {
		if(id==1) {
			return "User Registered Successfully";
		}
		else {
			return "User Registration Failed";
		}
	}
}
