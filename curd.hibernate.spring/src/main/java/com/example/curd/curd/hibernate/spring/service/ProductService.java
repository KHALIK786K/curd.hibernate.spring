package com.example.curd.curd.hibernate.spring.service;

import java.util.List;

import com.example.curd.curd.hibernate.spring.model.Product;


public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}
