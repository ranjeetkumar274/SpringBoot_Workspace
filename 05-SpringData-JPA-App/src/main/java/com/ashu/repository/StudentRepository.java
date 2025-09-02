package com.ashu.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashu.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public List<Student> findByGender(String gender);
	
	public List<Student> findByRankGreaterThanEqual(long rank);
	
	
	@Query("from Student")   // HQL
	public List<Student> getStudents();

}
