package com.example.demo.service;

import com.example.demo.entities.Product;
import java.util.List;

public interface ProductService {
  Product createProduct(Product product);
  Product getProduct(Long id);
  Product editProduct(Product product);
  void deleteProduct(Product product);
  void deleteProduct(Long id);
  List getAllProducts(int pageNumber, int pageSize);
  List getAllProducts();
  long countProducts();

}
