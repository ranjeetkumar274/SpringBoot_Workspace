package com.ashu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashu.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(value = "call getProduct()", nativeQuery = true)
	public List<Product> getProduct();

}
