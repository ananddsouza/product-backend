package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product") //pre-path

// Cross Origins value specified explicitly since we don't have the client and server running on same host
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController
{   
    // Product Service interface instance 
    @Autowired
    private IProductService productService;

    // POST Method - Save Product 
    // Input param - Product 
    @PostMapping(value = "/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product)
    {   
        // return saved entity
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    // DELETE Method - Delete Product
    // Input param - Product Id
    @DeleteMapping("/deleteProduct/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable long productId)
    {   
        // calls the delete product method using product Id
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // GET Method - gets list of products
    @GetMapping(value = "/getAllProducts")
    public ResponseEntity<?> getAllProducts()
    {
        return ResponseEntity.ok(productService.findAllProducts());
    }

    // GET Method - Gets product details by Id
    // Input param - Product Id
    @GetMapping(value = "/getProduct/{productId}")
    public ResponseEntity<?> getProduct(@PathVariable long productId)
    {
        return ResponseEntity.ok(productService.findProduct(productId));
    }



}