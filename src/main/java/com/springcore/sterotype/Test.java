package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/stereoconfig.xml");
        Student s = context.getBean("obj",Student.class);
        
        System.out.println(s);
        
        System.out.println(s.hashCode());
        
        Student s2 = context.getBean("obj", Student.class);
        
        System.out.println(s2.hashCode());
        
        
        Teacher t1 = context.getBean("teacher", Teacher.class);
        Teacher t12 = context.getBean("teacher", Teacher.class);
        
        System.out.println(t1.hashCode());
        System.out.println(t12.hashCode());
        
        /* Singleton Prototype request session globalsession Bean Scope */
        
        
        //change scope from singleton to prototype two ways: annotation, xml file

	}

}
//330382173