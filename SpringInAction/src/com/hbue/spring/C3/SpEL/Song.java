package com.hbue.spring.C3.SpEL;

public class Song {
	private String title;
	private String artist;
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
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + "]";
	}
	public Song() {
	}
	public Song(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	
}
