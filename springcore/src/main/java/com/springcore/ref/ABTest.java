package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ABTest {

	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a = (A)context.getBean("aref");
		System.out.println(a.getX());
		//System.out.println(a.getOb().getY());
		
		System.out.println(a);
		
		B b = (B)context.getBean("bref");
		System.out.println(b);
		System.out.println(b.getY());
	}

}
