package com.ashu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
