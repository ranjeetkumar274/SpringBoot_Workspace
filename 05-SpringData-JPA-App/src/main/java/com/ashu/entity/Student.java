package com.ashu.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT_DTLS")
public class Student {
	
	
	public Student() {
		
	}
	
	
	public Student(int id, String name, long rank, String gender) {
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
	}
	

	@Id
	@Column(name="STUDENT_ID")
	private int id;
	
	@Column(name="STUDENT_NAME")
	private String name;
	
	@Column(name="STUDENT_RANK")
	private long rank;
	
	@Column(name="STUDENT_GENDER")
	private String gender;
	
	@CreationTimestamp
	@Column(name = "CREATION_TIME", updatable = false)
	private LocalDateTime createTime;
	
	@UpdateTimestamp
	@Column(name = "UPDATE_TIME")
	private LocalDateTime updateTime;
	
	
	public LocalDateTime getCreateTime() {
		return createTime;
	}


	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


	public LocalDateTime getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRank() {
		return rank;
	}
	public void setRank(long rank) {
		this.rank = rank;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + "]";
	}
}
