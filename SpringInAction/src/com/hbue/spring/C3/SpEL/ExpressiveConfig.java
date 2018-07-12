package com.hbue.spring.C3.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ComponentScan
@ImportResource("classpath:com/hbue/spring/C3/SpEL/springContext.xml")
//@PropertySource("classpath:com/hbue/spring/C3/SpEL/app.properties")
public class ExpressiveConfig {
	
/*	@Autowired
	Environment env;*/
	
	@Bean
	public BlankDisc blankDisc(@Value("${disc.title}")String title, @Value("${disc.artist}")String artist){
		return new BlankDisc(title, artist); 
	}
	
	@Bean
	public MediaPlayer player(CompactDisc disc){
		return new CDPlayer(disc);
	}
	@Bean
	public JukeBox jukebox(){
		return new JukeBox();
	}
}
