package com.jspider;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jspider.entity.Account;
import com.jspider.entity.AccountPK;
import com.jspider.repository.AccountRepo;

@SpringBootApplication
public class Application {

    private final AccountRepo accountRepo;

    Application(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		AccountRepo repository = context.getBean(AccountRepo.class);
		
//		=======================================
//		INSERTING
//		=======================================
//		AccountPK pk = new AccountPK();
//		pk.setAccNum(2345465446622l);
//		pk.setAccType("Saving");
//		
//		Account acc = new Account();
//		acc.setHolderName("Raj");
//		acc.setBranch("Janakpur");
//		acc.setAccountPk(pk);
//		
//		repository.save(acc);
//		
//		System.out.println("Record saved...");
		
//		==========================================
//		RETRIVING
//		=========================================
		AccountPK pk = new AccountPK();
		pk.setAccNum(2345465446622l);
        pk.setAccType("Saving");	
        
        Optional<Account> findById = repository.findById(pk);
        if(findById.isPresent())
        	System.out.println(findById.get());
        else {
        	System.out.println("Data Not Found");
        }
      
      
	}

}
