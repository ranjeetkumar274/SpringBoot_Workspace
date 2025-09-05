package com.ashu.entity;

import jakarta.validation.constraints.NotNull;

public class Product {
	
	@NotNull(message = "Product id is mandatory")
	private Integer pid;
	
	@NotNull(message = "Product name is mandatory")
	private String pname;
	
	@NotNull(message = "Product price is mandatory")
	private Double price;
	
	
	
	public Integer getPid() {
		return pid;
	}



	public void setPid(Integer pid) {
		this.pid = pid;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
}
