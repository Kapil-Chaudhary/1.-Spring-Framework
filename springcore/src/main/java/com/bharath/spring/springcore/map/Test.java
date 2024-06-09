package com.bharath.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/map/mapconfig.xml");
		Customer customer = context.getBean(Customer.class);
		
		System.out.println(customer.getId());
		System.out.println(customer.getProducts());
		System.out.println(customer.getProducts().getClass());
		
		System.out.println(customer);
		
	}

}
