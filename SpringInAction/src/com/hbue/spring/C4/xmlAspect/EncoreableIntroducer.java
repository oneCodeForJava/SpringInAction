package com.hbue.spring.C4.xmlAspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

//@Aspect
public class EncoreableIntroducer {
	
	@DeclareParents(value="com.hbue.spring.C4.aspect.Performance+", defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
}
