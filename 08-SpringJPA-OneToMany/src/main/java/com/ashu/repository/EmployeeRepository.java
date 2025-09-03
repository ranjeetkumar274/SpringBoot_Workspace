package com.ashu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
