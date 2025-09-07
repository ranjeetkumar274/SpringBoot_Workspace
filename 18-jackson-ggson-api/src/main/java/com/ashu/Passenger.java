package com.ashu;



public class Passenger {
	
	private Integer id;
	private String from;
	private String to;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", from=" + from + ", to=" + to + ", name=" + name + "]";
	}
	
	
}
