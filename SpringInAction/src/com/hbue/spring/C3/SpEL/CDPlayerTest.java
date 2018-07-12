package com.hbue.spring.C3.SpEL;

import java.util.List;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ExpressiveConfig.class)
public class CDPlayerTest {
	
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	@Autowired
	private CompactDisc cd;
	@Value("#{player}")
	private MediaPlayer player;
	
	@Value("#{T(System).currentTimeMillis()}")
	private long currentTime;
	@Value("#{blankDisc.artist}")
	private String artist;
	@Value("${disc.title")
	private String title;
	@Value("#{blankDisc.selectArtist()?.toUpperCase()}")
	private String upperCase;
	@Value("#{blankDisc.score > 1000 ? \"Winner!\":\"Loser\"}")
	private String winner;
	@Value("#{jukebox.songs[4].title}")
	private String forTitle;
	@Value("#{jukebox.songs.?[artist eq 'Aerosmith']}")
	private List<Song> aerosmith;
	
	@Test
	public void cdShouldNotBeNull(){
		Assert.assertNotNull(cd);
	}
	
	@Test
	public void playDisc(){
		cd.play();
		System.out.println("current:" + currentTime);
		System.out.println("artist: " + artist);
		System.out.println("title: " + title);
		System.out.println("artistUpper: " + upperCase);
		System.out.println("winner: " + winner);
		System.out.println("forTitle: " + forTitle);
		System.out.println("aerosmith List:" + aerosmith);
	}
	
	@Test
	public void play(){
		player.play();
		Assert.assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", log.getLog());
	}
}
