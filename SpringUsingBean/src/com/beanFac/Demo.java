package com.beanFac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory b=new DefaultListableBeanFactory();
		BeanDefinitionRegistry bdr=(BeanDefinitionRegistry)b;
		XmlBeanDefinitionReader xbr=new XmlBeanDefinitionReader(bdr);
		xbr.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
		
		Employee emp=(Employee)b.getBean("emp");
		
		System.out.println("Empl id is "+emp.getEmpId());
		System.out.println("Empl name is "+emp.getName());
		System.out.println("Empl hobby are "+Arrays.toString(emp.getHobbies()));
		System.out.println("Empl emails are "+emp.getEmail());
		System.out.println("Empl phn's are "+emp.getPhn());
		System.out.println("Empl educ are "+emp.getEducation());
		HashSet s=new HashSet();
		s.add(emp.getEducation());
		Iterator it=s.iterator();
		System.out.println("education dtailas are");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
