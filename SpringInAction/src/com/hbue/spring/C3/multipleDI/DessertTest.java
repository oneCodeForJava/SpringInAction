package com.hbue.spring.C3.multipleDI;

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
@ContextConfiguration(classes=DessertConfig.class)
public class DessertTest {
	
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	@Autowired
	//@Qualifier("cookies")
	@Cold
	@Creamy
	private Dessert dst;
	
	@Test
	public void cdShouldNotBeNull(){
		Assert.assertNotNull(dst);
	}
	@Test
	public void play(){
		dst.eat();
	}
}
