package com.bharath.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/reftypes/config.xml");
		Student student = (Student) context.getBean("student");
		
		
		System.out.println(student.getClass());
		System.out.println(student);
		
		System.out.println(student.getScores());
		
		
	}

}
