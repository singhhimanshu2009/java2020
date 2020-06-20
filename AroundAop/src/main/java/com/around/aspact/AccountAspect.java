package com.around.aspact;


import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AccountAspect {

//	@Pointcut(value= "execution(* com.around.account.Account.deposit(..))")  
//	public String p1() {
//		return "around advice chal rhi h";
//	}
//	
	
	@Around(value= "execution(* com.around.account.Account.deposit(..))")  
	public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
		
		Object [] obj =jp.getArgs();
		List<Object>list =Arrays.asList(obj);
		String m = jp.getSignature().getName()+"()";
		System.out.println("The method aroundAdvice() before invokation of the method  "+m +"and this argument"+list);
	
		
		Object rvalue= jp.proceed();
		
		System.out.println("The method aroundAdvice() after invokation of the method  "+m);
		 
		System.out.println(rvalue+" is returned by "+m);
		
		if(rvalue == null || rvalue=="") {
			rvalue="failure";
			System.out.println("Return value is changed to failure by the advice.");
		}
		
		
	}
	
}
