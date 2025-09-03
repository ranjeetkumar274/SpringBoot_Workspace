package com.ashu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
