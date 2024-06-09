package com.bharath.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/constructorinjection/config.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

//		Employee employee2 = (Employee) context.getBean("employee");
//		System.out.println(employee2.hashCode());

	}

}
