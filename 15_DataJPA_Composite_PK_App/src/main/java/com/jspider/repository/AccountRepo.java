package com.jspider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.entity.Account;
import com.jspider.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK>{

}
