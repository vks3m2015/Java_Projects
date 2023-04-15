package com.vik.aopconcepts.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void simpleAdvice(){
		System.out.println(" Simple Advice...");
	}
	
	//Above Pointcut expression can be defined separately to use for multiple advices as below
	@Before("getNamePointCut()")
	public void loggingAdvice(){    
		System.out.println("Advice that use Pointcut seprately..");
	}
	
	
	@Before("getNamePointCut()")
	public void secondAdvice(JoinPoint jointPoint){
		System.out.println("Advice accessing target method.. " + jointPoint.toString());
	}
	
	//This advice will be executed whenever a method having a String argument is called
	@Before("args(name)")
	public void methodsTakingStringArgument(String name){
		System.out.println("argument ==="+name);
	}
	
	//get executed no matter exception thrown by target method or not
	@After("args(name)")
	public void advice(String name){
		System.out.println("argument ==="+name);
	}
	
	//This advice will get executed only if target method is executed successfully without throwing any exception
	@AfterReturning("args(name)")
	public void advice2(String name){
		System.out.println("argument ==="+name);
	}
	
	@AfterReturning(pointcut = "args(name)", returning = "returningString")
	public void advice3(String name, String returningString){
		System.out.println("argument ==="+name + " and return value =="+returningString);
	}
	
	//if target method throws exception..
	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void exceptionAdvice(String name, RuntimeException ex){
		System.out.println(" exception has been thrown...");
	}
	
	
	@Around("getNamePointCut()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object returnValue = null;
		
		try {
			
			System.out.println(" Before Advice...");
			returnValue = proceedingJoinPoint.proceed();   //Here target method will be called
			System.out.println(" After returning....");
			
		} catch (Throwable e) {
			System.out.println(" After throwing...");
			//e.printStackTrace();
		}
		
		System.out.println(" After finally....");
		return returnValue;
	}
	
	/*------------------------
	 *  POINTCUTS
	 -------------------------*/
	
	@Pointcut("execution(public String getName())")
	public void getNamePointCut(){}
	
	//This advice (if we use )will apply to all methods of Circle class
	@Pointcut("execution(* * com.vik.aopconcepts.models.Circle.*(..))")
	public void toAllMethodsOfCircleClass(){}
	
	//Above can also be achieved through 'within'
	@Pointcut("within(com.vik.aopconcepts.models.Circle)")
	public void toAllMethodsOfCircleClassUsingWithin(){}
	
	
	//All the methods those take String as a parameter
	@Pointcut("args(String)")
	public void stringArgumentMethods(){}
	
	
}
