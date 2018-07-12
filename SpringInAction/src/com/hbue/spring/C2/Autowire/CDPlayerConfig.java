package com.hbue.spring.C2.Autowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.hbue.spring")
//@ComponentScan(basePackages={"com.hbue.spring"})
@ComponentScan(basePackageClasses=SgtPeppers.class)
public class CDPlayerConfig {
}
