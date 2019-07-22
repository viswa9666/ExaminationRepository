package com.slokam.Examination.AspectTest;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

import com.slokam.Examination.entity.UserPojo;

@Aspect
@Configuration
public class AspectTesting {
	
	@Pointcut("execution(public String someThing())")
	public void sameName(){
		
	}
//	@Before("sameName()")
//	public void set(){
//		System.out.println("Before Service");
//	}
	
//	@After("sameName()")
//	public void set1(){
//		System.out.println("Before Service");
//	}
	@Around("sameName()")
	public Object done(ProceedingJoinPoint joinPoint) throws Throwable{
		StopWatch watch=new StopWatch();
		watch.start();
	Object obj=	joinPoint.proceed();
	watch.stop();
	watch.prettyPrint();
		return obj;
	}

}
