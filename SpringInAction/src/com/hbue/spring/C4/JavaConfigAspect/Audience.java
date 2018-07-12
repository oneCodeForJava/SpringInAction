package com.hbue.spring.C4.JavaConfigAspect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(* com.hbue.spring.C4.aspect.Performance.perform(..))")
	private void performance(){}
	
/*	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}
	@Before("performance()")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("CLAP CLAP CLAP");
	}
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}*/
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try {
			System.out.println("Taking seats");
			System.out.println("Silencing cell phones");
			String methodName = jp.getSignature().getName();
			String className = jp.getTarget().getClass().getName();
			System.out.println(className);
			System.out.println(methodName);
			Object[] args = jp.getArgs();
			List<Object> params = new ArrayList<>(Arrays.asList(args));
			System.out.println(params);
			Object result = jp.proceed();
			System.out.println(result);
			System.out.println("CLAP CLAP CLAP");
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
		}
	}
}
