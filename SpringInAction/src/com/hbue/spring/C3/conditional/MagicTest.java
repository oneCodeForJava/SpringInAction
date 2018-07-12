package com.hbue.spring.C3.conditional;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MagicBeanConfig.class)
public class MagicTest {
	
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	@Autowired
	private MagicBean cd;
	
	@Test
	public void cdShouldNotBeNull(){
		Assert.assertNotNull(cd);
	}
}
