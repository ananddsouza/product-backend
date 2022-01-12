package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    // Interface - Product Repository
    private final IProductRepository productRepository;

    // Constructor
    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Implementation - Save Product method
    @Override
    public Product saveProduct(Product product) {
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    // Implementation - delete product method
    @Override
    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }

    // Implementation - find all products
    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    // Implementation - find product by id
    @Override
    public Product findProduct(long productId) {
        Optional<Product> optionalEntity = productRepository.findById(productId);
        Product product = optionalEntity.get();
        return product;

    }

}