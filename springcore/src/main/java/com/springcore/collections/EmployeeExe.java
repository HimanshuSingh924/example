package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeExe
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Employee employee = (Employee) context.getBean("employee1");
		//System.out.println(employee);
		
		System.out.println(employee.getName());
		System.out.println(employee.getPhones());
		System.out.println(employee.getAddress());
		System.out.println(employee.getCourse());
	}
}
