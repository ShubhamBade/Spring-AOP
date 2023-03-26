package com.AOPService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("Spring AOP Example");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("configuration_AOP.xml");
		
		PaymentService paymentService=(PaymentService)context.getBean("payment");
		
		
		// want do something before payment- with out changing code using AOP
		//we can use aspect-j- need add dependency springaop aspectjrt aspectweaver
		paymentService.makePayment();
	}
}
