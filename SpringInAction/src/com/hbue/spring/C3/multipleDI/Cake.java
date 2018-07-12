package com.hbue.spring.C3.multipleDI;

import org.springframework.stereotype.Component;

@Component
//@Primary //标识首选bean
//@Qualifier("cake") //自定义限定符
@Cold //自定义注解
public class Cake implements Dessert{
	
	public Cake(){
		System.out.println("create Cake");
	}
	@Override
	public void eat() {
		System.out.println("eat Cake");
	}

}
