package com.hbue.spring.C3.Scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CDPlayerConfig {
	//默认name为方法名
	@Bean(name="lonelyHeartsClubBand")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
//	@Bean
//	public CDPlayer cdPlayer(){
//		return new CDPlayer(sgtPeppers());
//	}
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}
}
