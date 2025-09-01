package com.ashu.repository;

import org.springframework.data.repository.CrudRepository;

import com.ashu.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
