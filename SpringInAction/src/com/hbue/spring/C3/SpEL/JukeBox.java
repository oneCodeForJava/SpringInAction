package com.hbue.spring.C3.SpEL;

import java.util.ArrayList;
import java.util.List;

public class JukeBox {
	private List<Song> songs;

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public JukeBox(){
		songs = new ArrayList<>();
		songs.add(new Song("Sgt. Pepper's Lonely Hearts Club Band", "li"));
		songs.add(new Song("With a Little Help from My Friends", "yun"));
		songs.add(new Song("Lucy in the Sky with Diamonds", "li"));
		songs.add(new Song("Getting Better", "yun"));
		songs.add(new Song("Fixing a Hole", "Aerosmith"));
	}
	
}
