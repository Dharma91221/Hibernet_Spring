package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Sbi_BK sbi=(Sbi_BK)ac.getBean("Sbi_BK");
		//sbi.getCust().cus();
	}

}
