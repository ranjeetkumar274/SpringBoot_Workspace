package com.ashu.bean;

public class Car {
	
	private IEngine eng;
	
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		eng.start();
		System.out.println("Car is moving");
	}
}
