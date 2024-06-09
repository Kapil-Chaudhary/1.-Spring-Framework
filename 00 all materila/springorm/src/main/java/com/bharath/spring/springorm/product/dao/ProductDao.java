package com.bharath.spring.springorm.product.dao;

import org.springframework.stereotype.Component;

import com.bharath.spring.springorm.product.entity.Product;


public interface ProductDao {
	int create(Product product);
	
}
