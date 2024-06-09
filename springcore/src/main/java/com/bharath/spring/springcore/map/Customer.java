package com.bharath.spring.springcore.map;

import java.util.Map;

public class Customer {
	private String id;
	private Map<Integer, String> products;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	
	
	@Override
	public String toString() {
		String ans = "Customer [id=" + id + " , products= " + products +   "]";
		return ans;
	}

}
