package com.around;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.around.account.Account;

@SpringBootApplication
public class AroundAopApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AroundAopApplication.class, args);
		
		Account accont =(Account)ctx.getBean(Account.class);
		accont.deposit(10000,10);
	}

}
