package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = (Student) context.getBean("getStudent");
		System.out.println(student);
		student.Study();
	}

}
