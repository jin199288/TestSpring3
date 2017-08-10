package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectBean {

	@Pointcut("execution(* com.aop.PointCut*.*(..))")
	public void pointCut(){}
	
	@Before("pointCut()")
	public void befor(){
		System.out.println("this is befor method..");
	}
	@AfterReturning(pointcut="pointCut()",returning="reVal")
	public void afterReturning(Object reVal){
		System.out.println("this is afterReturning method.."+reVal);
	}
	@After("pointCut()")
	public void after(){
		System.out.println("this is after method..");
	}
	@AfterThrowing(pointcut="pointCut()",throwing="reVal")
	public void afterThrowing(Object reVal){
		System.out.println("this is afterThrowing method.."+reVal);
	}
	/*@Around("pointCut()")
	public Object around(ProceedingJoinPoint pjp){
		System.out.println("this is around befor method..");
		Object proceed = null;
		try {
			proceed = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("this is around after method..");
		return proceed;
	}*/
}
