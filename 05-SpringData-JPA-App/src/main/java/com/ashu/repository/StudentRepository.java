package com.ashu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ashu.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	public List<Student> findByGender(String gender);
	
	public List<Student> findByRankGreaterThanEqual(long rank); 
}
