package com.hbue.spring.C4.JavaConfigAspect;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {
	
	@Bean
	public Audience audience(){
		return new Audience();
	}
	
	@Bean
	public TrackCounter trackCounter(){
		return new TrackCounter();
	}
	
	@Bean
	public EncoreableIntroducer encoreableIntroducer(){
		return new EncoreableIntroducer();
	}
	
	@Bean
	public CompactDisc sgtPeppers(){
		BlankDisc cd = new BlankDisc();
		cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
		cd.setArtist("The Beatles");
		List<String> tracks = new ArrayList<String>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
		tracks.add("With a Little Help from My Friends");
		tracks.add("Lucy in the Sky with Diamonds");
		tracks.add("Getting Better");
		tracks.add("Fixing a Hole");
		cd.setTracks(tracks);
		return cd;
	}
}
