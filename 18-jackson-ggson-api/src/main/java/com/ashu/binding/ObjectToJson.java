package com.ashu.binding;

import java.io.FileWriter;
import java.io.IOException;

import com.ashu.Passenger;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.google.gson.Gson;

public class ObjectToJson {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Passenger p = new Passenger();
		p.setId(101);
		p.setFrom("HYD");
		p.setTo("NOIDA");
		p.setName("Rock");
			
		Gson gson = new Gson();
		try (FileWriter writer = new FileWriter("passengers.json")) {
            gson.toJson(p, writer);
            System.out.println("JSON written to passengers.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
