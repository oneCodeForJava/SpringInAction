package com.hbue.spring.C4.JavaConfigAspect;

public class DefaultEncoreable implements Encoreable{

	@Override
	public void performEncore() {
		System.out.println("performEncore");
	}

}
