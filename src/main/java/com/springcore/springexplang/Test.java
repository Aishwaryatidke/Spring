package com.springcore.springexplang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/springexplang/config.xml");
		Demo d1 = con.getBean("demo", Demo.class);
		
		System.out.println(d1);
		
		//SpelExpressionParser
		
		//ExpressionParser el = new SpelExpressionParser();
	}

}
