package com.ashu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
