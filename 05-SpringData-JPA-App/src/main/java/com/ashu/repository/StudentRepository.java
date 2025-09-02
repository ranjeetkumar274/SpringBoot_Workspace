package com.ashu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ashu.entity.Student;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public List<Student> findByGender(String gender);
	
	public List<Student> findByRankGreaterThanEqual(long rank);
	
	
	@Query("from Student")   // HQL
	public List<Student> getStudents();
	
	
	@Query("update Student s set s.rank = :rank where s.id = :id")
	@Modifying
	@Transactional
	public void updateStudentById(@Param("rank") long rank, @Param("id") Integer id);

	

}
