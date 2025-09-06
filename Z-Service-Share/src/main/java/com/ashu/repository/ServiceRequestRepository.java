package com.ashu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.entity.ServiceRequestEntity;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequestEntity, Long> {

}
