package com.bharath.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/constructorinjection/ambiguity/config.xml");

		Addition addition = (Addition) context.getBean("addition");
		System.out.println(addition);

//		Employee employee2 = (Employee) context.getBean("employee");
//		System.out.println(employee2.hashCode());
	
	}
}
