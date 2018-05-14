package com.zaghir.aspectJ.simpleAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AscpectDemo1 {
	String s="" ;
	int i = 1 ;
	private Logger log = LoggerFactory.getLogger(AscpectDemo1.class);

	@Before("execution(* com.zaghir.aspectJ..*.*(..))")
	public void logBefore(JoinPoint joinPoint){

		//log.info("----->Before  joinPoint ==> {} {} ",s, joinPoint);
		log.info("{} {} {}",s,i, joinPoint);
		s +="....";
		i += 1 ;
	}
	
	@After("execution(* com.zaghir.aspectJ..*.*(..))")
	public void logAfter(JoinPoint joinPoint){
		//log.info("-----> After  joinPoint ==> {} ", joinPoint);
		s = s.substring(0, s.length() -4 ) ;
		i -= 1 ;
		log.info(s);
	}
	
//	@After("execution(* com.zaghir.aspectJ..*.*(..))")
//	public void logClass(JoinPoint joinPoint){
//		log.info("-----> class {} ", joinPoint.getTarget().getClass());
//		
//	}
}
