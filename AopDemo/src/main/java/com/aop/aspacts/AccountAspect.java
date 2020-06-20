package com.aop.aspacts;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AccountAspect {
	
	
	@Pointcut("execution(* com.aop.account.Account.*(..))")
	public void log() {}
	
	
	@Before("log()")
	public void preprocessing(JoinPoint jp) {
		Object [] arg =jp.getArgs();
		List<Object> list = Arrays.asList(arg);
		String m = jp.getSignature().getName()+"()";
		System.out.println("Before advice is applied on "+m +"with this arguments "+list);
	}
	
	@After("log()")
	public void postProcessing(JoinPoint jp) {
		String m = jp.getSignature().getName()+"()";
		System.out.println("After advice is applied on "+m);
	}
	
	
}
