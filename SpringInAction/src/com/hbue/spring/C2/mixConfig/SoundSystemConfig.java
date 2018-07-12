package com.hbue.spring.C2.mixConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:com/hbue/spring/C2/mixConfig/springContext.xml")
public class SoundSystemConfig {

}
