package com.bharath.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = context.getBean(CarDealer.class);
		
		System.out.println(carDealer.getName());
		System.out.println(carDealer.getModels());
		System.out.println(carDealer.getModels().getClass());
	}

}
