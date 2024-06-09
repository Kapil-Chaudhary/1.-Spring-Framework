package com.bharath.spring.springcore.propertyplaceholder;

public class MYDAO {
	private String dbserver;

	MYDAO(String dbserver) {
		this.dbserver = dbserver;
	}

	@Override
	public String toString() {
		return "MYDAO [dbserver=" + dbserver + "]";
	}

}
