package com.aop.account;
import org.springframework.stereotype.Service;

@Service
public class Accountimpl implements Account{

	
		public void withdrawal() {
		
		System.out.println("withdrawl");
	}

	@Override
	public void deposit(Integer a, Integer b) {
		System.out.println("deposit with "+a +"and "+b);
		
	}

}
