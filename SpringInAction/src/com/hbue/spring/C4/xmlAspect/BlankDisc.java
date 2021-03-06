package com.hbue.spring.C4.xmlAspect;

import java.util.List;

public class BlankDisc implements CompactDisc{
	
	private String title;
	private String artist;
	private List<String> tracks;
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for(String track: tracks){
			System.out.println("-Track: " + track);
		}
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}


	@Override
	public void playTrack(int track) {
		if(track > tracks.size()){
			System.out.println("none");
		}else{
			System.out.println(tracks.get(track));
		}
		
	}

}
