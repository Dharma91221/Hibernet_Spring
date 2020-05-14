package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=(Employee)ac.getBean("emp");
		System.out.println("Empl id is "+emp.getEmpId());
		System.out.println("Empl name is "+emp.getName());
		System.out.println("Empl salary is "+emp.getSalary());
	}

}
