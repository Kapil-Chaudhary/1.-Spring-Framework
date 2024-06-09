package com.bharath.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/properties/propertyconfig.xml");
		CountriesAndLanguages coun = (CountriesAndLanguages) context.getBean("countAndLang");
		
		System.out.println(coun.getCountryAndLangs());
		System.out.println(coun);
	}

}
