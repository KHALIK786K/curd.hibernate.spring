package com.example.curd.curd.hibernate.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curd.curd.hibernate.spring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}