package com.hbue.spring.C4.JavaConfigAspect;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance{
	@Override
	public void perform(User user) {
		
		System.out.println("play...........");
		user.setPlay(true);
		System.out.println(user);
	}

}
