package com.example.product.repository;


import com.example.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Product Repository - Interface
public interface IProductRepository extends JpaRepository<Product, Long>
{


}