package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocDemo {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	Car c=(Car)context.getBean("c1");
	System.out.println(c.getCid());
	System.out.println(c.getMake());
	System.out.println(c.getPrice());
	System.out.println(c.getEng().getId());
	System.out.println(c.getEng().getMake());
	System.out.println(c.getEng().getCapacity());
	
	
		

	}

}
 