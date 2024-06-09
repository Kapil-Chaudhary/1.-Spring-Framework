package com.bharath.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
//	Addition(Double a, Double b){
//		System.out.println("Inside Constructor Double");
//	}
	
//	Addition(int a, int b){
//		System.out.println("Inside Constructor INT");
//	}
//	
//	Addition(String a, String b){
//		System.out.println("Inside Constructor STRING");
//	}
	
	Addition(int a, double b){
	System.out.println("Inside the Constructor");
	System.out.println(a);
	System.out.println(b);
	}
}
