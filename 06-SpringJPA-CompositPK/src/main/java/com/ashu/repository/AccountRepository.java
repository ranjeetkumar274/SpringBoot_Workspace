package com.ashu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.entity.Account;
import com.ashu.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK>{

}
