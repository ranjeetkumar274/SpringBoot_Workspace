package com.ashu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
