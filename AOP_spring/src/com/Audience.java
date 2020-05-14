package com;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public void takeseats() {
		System.out.println("The audience is talking their seats");
	}
	
	public void applaud() {
		System.out.println("CLAP CLAP");
	}
	
	public void demandRefund() {
		System.out.println("We want our money back");
	}
	public void walkout() {
		System.out.println("Show is over, audience are leaving");
	}
	public void m1(ProceedingJoinPoint pj)throws Throwable{
		System.out.println("Entering the method");
		pj.proceed();
		System.out.println("Exiting the method");
	}
}
