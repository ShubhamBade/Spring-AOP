package com.AOPAspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

		@Before("execution(* com.AOPService.PaymentServiceImple.makePayment())")
		public void printBefore() {
			System.out.println("Advice : Payment has been started :");
		}
		
		@After("execution(* com.AOPService.PaymentServiceImple.makePayment())")
		public void printAfter() {
			System.out.println("Advice : Payment has been ended :");
		}
}
