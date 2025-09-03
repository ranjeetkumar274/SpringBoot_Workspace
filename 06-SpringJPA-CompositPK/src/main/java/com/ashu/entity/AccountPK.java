package com.ashu.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class AccountPK implements Serializable{
	
	private Integer accId;
	private String accType;
	private Integer accNo;
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	@Override
	public String toString() {
		return "AccountPK [accId=" + accId + ", accType=" + accType + ", accNo=" + accNo + "]";
	}
	
	
}
