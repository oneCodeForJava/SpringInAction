package com.hbue.spring.C3.multipleDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class DessertConfig {
	
	@Bean
	//@Qualifier("cake")
	@Cold
	public Dessert cake(){
		return new Cake();
	}
	
	@Bean
	//@Qualifier("cookies")
	@Cold
	public Dessert cookies(){
		return new Cookies();
	}
	
	@Bean
	//@Qualifier("iceCream")
	@Cold
	@Creamy
	public Dessert iceCream(){
		return new IceCream();
	}
	
}
