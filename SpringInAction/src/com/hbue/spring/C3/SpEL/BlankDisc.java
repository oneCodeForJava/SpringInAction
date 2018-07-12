package com.hbue.spring.C3.SpEL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class BlankDisc implements CompactDisc{
	
	private String title;
	private String artist;
	private int score = 100;
	private List<String> tracks;
	
	@Autowired
	public BlankDisc(@Value("${disc.title}")String title, @Value("${disc.artist}")String artist){
		this.title = title;
		this.artist = artist;
		this.tracks = null;
	}
	public BlankDisc(String title, String artist, List<String> tracks){
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}
	
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		
/*		for(String track: tracks){
			System.out.println("-Track: " + track);
		}*/
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String selectArtist(){
		return null;
	}
	public int getScore() {
		return score;
	}
	
	

}
