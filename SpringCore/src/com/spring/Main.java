package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("core.xml");
		Student st1=(Student)context.getBean("s2");
		
		System.out.println(st1.getId());
		System.out.println(st1.getName());
		
	}

}
