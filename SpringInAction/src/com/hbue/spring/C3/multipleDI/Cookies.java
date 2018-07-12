package com.hbue.spring.C3.multipleDI;

import org.springframework.stereotype.Component;

@Component
//@Qualifier("cookies")
@Cold
public class Cookies implements Dessert{
	
	public Cookies(){
		System.out.println("create Cookies");
	}
	@Override
	public void eat() {
		System.out.println("eat Cookies");
	}

}
