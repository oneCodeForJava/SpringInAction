package com.hbue.spring.C4.JavaConfigAspect;

import java.util.Date;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConcertConfig.class)
public class PerformanceTest {
	
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	@Autowired
	private Performance p;
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private TrackCounter counter;
	
	@Autowired
	@Qualifier("performanceImpl")
	private Encoreable encoreable;
	
	@Test
	public void cdShouldNotBeNull(){
		Assert.assertNotNull(p);
	}
	
	@Test
	public void performEncore(){
		encoreable.performEncore();
	}
	
	@Test
	public void playDisc(){
		User user = new User();
		user.setName("lixiang");
		user.setAge(18);
		user.setPlay(false);
		user.setPlayTime(new Date());
		p.perform(user);
	}
	
	@Test
	public void testTrackCounter(){
		cd.playTrack(1);
		cd.playTrack(2);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(7);
		cd.playTrack(7);
		Assert.assertEquals(1, counter.getPlayCount(1));
		Assert.assertEquals(1, counter.getPlayCount(2));
		Assert.assertEquals(4, counter.getPlayCount(3));
		Assert.assertEquals(0, counter.getPlayCount(4));
		Assert.assertEquals(0, counter.getPlayCount(5));
		Assert.assertEquals(0, counter.getPlayCount(6));
		Assert.assertEquals(2, counter.getPlayCount(7));
	}
}
