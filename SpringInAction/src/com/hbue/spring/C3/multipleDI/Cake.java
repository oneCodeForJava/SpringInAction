package com.hbue.spring.C3.multipleDI;

import org.springframework.stereotype.Component;

@Component
//@Primary //��ʶ��ѡbean
//@Qualifier("cake") //�Զ����޶���
@Cold //�Զ���ע��
public class Cake implements Dessert{
	
	public Cake(){
		System.out.println("create Cake");
	}
	@Override
	public void eat() {
		System.out.println("eat Cake");
	}

}
