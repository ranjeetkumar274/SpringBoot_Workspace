package com.ashu.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashu.entities.CitizenPlanInfo;

public interface CitizenPlanInfoRepo extends JpaRepository<CitizenPlanInfo, Integer> {
	
	@Query("select distinct c.planName from CitizenPlanInfo c")
	List<String> getPlanNames();
	
	@Query("select distinct c.planStatus from CitizenPlanInfo c")
	List<String> getPlanStatus();

}
