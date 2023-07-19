package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person person = (Person) context.getBean("ciperson");
		System.out.println(person);
	}

}
