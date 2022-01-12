package com.example.product.service;

import java.util.List;
import com.example.product.model.Product;

// Product Service Interface 
public interface IProductService
{
    // Interface Methods - Used to implement actions in the classes that use this interface
    Product saveProduct(Product product);
    void deleteProduct(long productId);
    List<Product> findAllProducts();
    Product findProduct(long productId);
}