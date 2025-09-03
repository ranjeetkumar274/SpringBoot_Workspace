package com.ashu.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {
	
	private String accName;
	private String accBranch;
	
	@EmbeddedId
	private AccountPK accountPK;

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccBranch() {
		return accBranch;
	}

	public void setAccBranch(String accBranch) {
		this.accBranch = accBranch;
	}

	public AccountPK getAccountPK() {
		return accountPK;
	}

	public void setAccountPK(AccountPK accountPK) {
		this.accountPK = accountPK;
	}

	@Override
	public String toString() {
		return "Account [accName=" + accName + ", accBranch=" + accBranch + ", accountPK=" + accountPK + "]";
	}
	
	
}
