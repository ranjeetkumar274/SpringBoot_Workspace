package com.ashu.request;

import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;


public class SearchRequest {
	
	private String planName;
	private String planStatus;
	private String gender;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDate;
	
	
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
	    return "SearchRequest{" +
	            "planName='" + planName + '\'' +
	            ", planStatus='" + planStatus + '\'' +
	            ", gender='" + gender + '\'' +
	            ", startDate=" + startDate +
	            ", endDate=" + endDate +
	            '}';
	}
	
}
