package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aop.account.Account;

@SpringBootApplication

public class AopDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(AopDemoApplication.class, args);
		Account accont =(Account)ctx.getBean(Account.class);
		
		accont.deposit(1000, 2000);
		
	
		
	}

}
