package com.example.demo.controller;

import com.example.demo.entities.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorld {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/hello/{name}/{lname}")
    public String Hello(@PathVariable String name,@PathVariable String lname, @RequestParam("msg") String message) {
        return message + " " + name + lname;
    }

    @GetMapping(value = "/products")
    public List<Product> products() {
        return productService.getAllProducts();
    }

    @PostMapping(value = "/products")
    public Product addProducts(@RequestBody Product data) {
        return productService.createProduct(data);
    }

    @PutMapping(value = "/product/{productId}")
    public Product editProduct(@PathVariable Long productId, @RequestBody Product data) {
        return productService.editProduct(data);
    }

    @DeleteMapping(value = "/product/{productId}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long productId){
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
//    @GetMapping("/employee")
//    public List<Employee> getEmployees() {
////        return
//    }
}
