package com.hbue.spring.C3.Scope;

import java.util.Random;

public class SgtPeppers implements CompactDisc{
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	private static Random rand = new Random(47);
	public SgtPeppers() {
		System.out.println("create SgtPeppers " + rand.nextInt(100));
	}
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
