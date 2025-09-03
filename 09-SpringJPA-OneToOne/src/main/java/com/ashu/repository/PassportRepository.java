package com.ashu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
