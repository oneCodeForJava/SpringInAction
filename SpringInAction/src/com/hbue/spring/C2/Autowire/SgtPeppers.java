package com.hbue.spring.C2.Autowire;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc{
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
