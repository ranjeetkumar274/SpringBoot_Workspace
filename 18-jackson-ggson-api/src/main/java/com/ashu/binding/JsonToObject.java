package com.ashu.binding;

import java.io.FileReader;
import java.io.IOException;

import com.ashu.Passenger;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.google.gson.Gson;

public class JsonToObject {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
//		ObjectMapper mapper = new ObjectMapper();
//		Passenger p = mapper.readValue(new File("passenger.json"), Passenger.class);
//		System.out.println(p);
		
		
		
		Gson gson = new Gson();
		Passenger p = gson.fromJson(new FileReader("passenger.json"), Passenger.class);
		System.out.println(p);
	}
}
