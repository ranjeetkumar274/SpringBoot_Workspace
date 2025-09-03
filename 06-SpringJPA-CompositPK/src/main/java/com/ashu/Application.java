package com.ashu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashu.entity.Account;
import com.ashu.entity.AccountPK;
import com.ashu.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		AccountRepository accountRepo = context.getBean(AccountRepository.class);
		
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("Savings");
		pk.setAccNo(452639);
		
		Account acc = new Account();
		acc.setAccName("Ashu");
		acc.setAccBranch("Pune");
		acc.setAccountPK(pk);
		
		accountRepo.save(acc);
		
		accountRepo.findById(pk).ifPresent(a -> System.out.println(a));
	}

}
