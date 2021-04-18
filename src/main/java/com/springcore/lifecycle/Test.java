package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext c = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
	/*	Samosa s = (Samosa) c.getBean("s1");
		
		System.out.println(s);
		c.registerShutdownHook();
		
		System.out.println("************************************");
		
		Pepsi p1 = (Pepsi) c.getBean("p1");*/
		
		//System.out.println(p1);
		
		
       Example e1 = (Example) c.getBean("e1");
		
		System.out.println(e1);
		
		
		

	}

}
