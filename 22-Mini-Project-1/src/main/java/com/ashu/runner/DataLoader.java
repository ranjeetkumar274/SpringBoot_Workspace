package com.ashu.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ashu.entities.CitizenPlanInfo;
import com.ashu.repos.CitizenPlanInfoRepo;


@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private CitizenPlanInfoRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		repo.deleteAll();
		
		CitizenPlanInfo c1 = new CitizenPlanInfo();
		c1.setCitizenName("Ashu");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.of(2023, 1, 1));
		c1.setPlanEndDate(LocalDate.of(2023, 12, 31));
		c1.setBenefitAmount(5000.00);
		c1.setDenialReason(null);
		c1.setTerminationDate(LocalDate.of(2023, 6, 30));
		c1.setTerminationReason("New Job");

		CitizenPlanInfo c2 = new CitizenPlanInfo();
		c2.setCitizenName("Riya");
		c2.setGender("Female");
		c2.setPlanName("Food");
		c2.setPlanStatus("Denied");
		c2.setPlanStartDate(LocalDate.of(2023, 2, 1));
		c2.setPlanEndDate(LocalDate.of(2023, 11, 30));
		c2.setBenefitAmount(4500.00);
		c2.setDenialReason("Income above limit");
		c2.setTerminationDate(null);
		c2.setTerminationReason(null);

		CitizenPlanInfo c3 = new CitizenPlanInfo();
		c3.setCitizenName("John");
		c3.setGender("Male");
		c3.setPlanName("Medical");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.of(2023, 3, 1));
		c3.setPlanEndDate(LocalDate.of(2023, 10, 31));
		c3.setBenefitAmount(6000.00);
		c3.setDenialReason(null);
		c3.setTerminationDate(LocalDate.of(2023, 8, 15));
		c3.setTerminationReason("Moved to another state");

		CitizenPlanInfo c4 = new CitizenPlanInfo();
		c4.setCitizenName("Alice");
		c4.setGender("Female");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.of(2023, 4, 1));
		c4.setPlanEndDate(LocalDate.of(2023, 9, 30));
		c4.setBenefitAmount(5500.00);
		c4.setDenialReason(null);
		c4.setTerminationDate(null);
		c4.setTerminationReason(null);

		CitizenPlanInfo c5 = new CitizenPlanInfo();
		c5.setCitizenName("Bob");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setPlanStartDate(LocalDate.of(2023, 5, 1));
		c5.setPlanEndDate(LocalDate.of(2023, 12, 31));
		c5.setBenefitAmount(4800.00);
		c5.setDenialReason("Incomplete documents");
		c5.setTerminationDate(null);
		c5.setTerminationReason(null);

		CitizenPlanInfo c6 = new CitizenPlanInfo();
		c6.setCitizenName("Emma");
		c6.setGender("Female");
		c6.setPlanName("Medical");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.of(2023, 6, 1));
		c6.setPlanEndDate(LocalDate.of(2023, 11, 30));
		c6.setBenefitAmount(6200.00);
		c6.setDenialReason(null);
		c6.setTerminationDate(LocalDate.of(2023, 9, 20));
		c6.setTerminationReason("Found employment");

		CitizenPlanInfo c7 = new CitizenPlanInfo();
		c7.setCitizenName("David");
		c7.setGender("Male");
		c7.setPlanName("Cash");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.of(2023, 7, 1));
		c7.setPlanEndDate(LocalDate.of(2023, 12, 31));
		c7.setBenefitAmount(5300.00);
		c7.setDenialReason(null);
		c7.setTerminationDate(null);
		c7.setTerminationReason(null);

		CitizenPlanInfo c8 = new CitizenPlanInfo();
		c8.setCitizenName("Sophia");
		c8.setGender("Female");
		c8.setPlanName("Food");
		c8.setPlanStatus("Denied");
		c8.setPlanStartDate(LocalDate.of(2023, 8, 1));
		c8.setPlanEndDate(LocalDate.of(2023, 11, 30));
		c8.setBenefitAmount(4700.00);
		c8.setDenialReason("Not eligible");
		c8.setTerminationDate(null);
		c8.setTerminationReason(null);

		CitizenPlanInfo c9 = new CitizenPlanInfo();
		c9.setCitizenName("Michael");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.of(2023, 9, 1));
		c9.setPlanEndDate(LocalDate.of(2023, 10, 31));
		c9.setBenefitAmount(6100.00);
		c9.setDenialReason(null);
		c9.setTerminationDate(LocalDate.of(2023, 10, 15));
		c9.setTerminationReason("Relocated");

		CitizenPlanInfo c10 = new CitizenPlanInfo();
		c10.setCitizenName("Olivia");
		c10.setGender("Female");
		c10.setPlanName("Cash");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.of(2023, 10, 1));
		c10.setPlanEndDate(LocalDate.of(2023, 12, 31));
		c10.setBenefitAmount(5400.00);
		c10.setDenialReason(null);
		c10.setTerminationDate(null);
		c10.setTerminationReason(null);

		
		
		
		
		System.out.println(c1);
		
		List<CitizenPlanInfo> entities = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);
		
		
	     repo.saveAll(entities);
		
	}

}
