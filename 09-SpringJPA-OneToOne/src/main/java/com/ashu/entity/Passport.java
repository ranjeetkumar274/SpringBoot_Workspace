package com.ashu.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportId;
	
	private String passportNumber;
	private LocalDate issueDate;
	private LocalDate expiryDate;
	
	
	@OneToOne
	@JoinColumn(name = "person_id", referencedColumnName = "personId")
	private Person person;


	public Integer getPassportId() {
		return passportId;
	}


	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}


	public String getPassportNumber() {
		return passportNumber;
	}


	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}


	public LocalDate getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}


	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
