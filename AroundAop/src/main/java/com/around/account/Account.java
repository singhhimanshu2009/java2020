package com.around.account;

import org.springframework.stereotype.Component;

@Component
public class Account {

	public Integer deposit(Integer balance,Integer j) {
		System.out.println("around advice deposit ="+balance);
		return 1000+balance;
	}
	
}
