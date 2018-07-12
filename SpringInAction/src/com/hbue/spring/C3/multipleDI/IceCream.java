package com.hbue.spring.C3.multipleDI;

import org.springframework.stereotype.Component;

@Component
//@Qualifier("iceCream")
@Cold
@Creamy
public class IceCream implements Dessert{
	
	public IceCream(){
		System.out.println("create IceCream");
	}
	@Override
	public void eat() {
		System.out.println("eat IceCream");
	}

}
