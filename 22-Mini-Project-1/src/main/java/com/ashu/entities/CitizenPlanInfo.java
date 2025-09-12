package com.ashu.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CITIZEN_PLAN_INFO")
public class CitizenPlanInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate planStartDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate planEndDate;
	private Double benefitAmount;
	private String denialReason;
	private LocalDate terminationDate;
	private String terminationReason;
	
	
	public Integer getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
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
	
	public Double getBenefitAmount() {
		return benefitAmount;
	}
	public void setBenefitAmount(Double benefitAmount) {
		this.benefitAmount = benefitAmount;
	}
	public String getDenialReason() {
		return denialReason;
	}
	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}
	public LocalDate getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(LocalDate terminationDate) {
		this.terminationDate = terminationDate;
	}
	public String getTerminationReason() {
		return terminationReason;
	}
	public void setTerminationReason(String terminationReason) {
		this.terminationReason = terminationReason;
	}
	
	
	
	
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	@Override
	public String toString() {
	    return "CitizenPlan{" +
	            "citizenId=" + citizenId +
	            ", citizenName='" + citizenName + '\'' +
	            ", gender='" + gender + '\'' +
	            ", planName='" + planName + '\'' +
	            ", planStatus='" + planStatus + '\'' +
	            ", planStartDate='" + planStartDate + '\'' +
	            ", planEndDate='" + planEndDate + '\'' +
	            ", benefitAmount=" + benefitAmount +
	            ", denialReason='" + denialReason + '\'' +
	            ", terminationDate=" + terminationDate +
	            ", terminationReason='" + terminationReason + '\'' +
	            '}';
	}

	
	
}
