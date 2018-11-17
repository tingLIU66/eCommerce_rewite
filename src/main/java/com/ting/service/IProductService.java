package com.ting.service;

import java.util.List;

import com.ting.entity.Product;


public interface IProductService {
    List<Product> getAllProducts();
    Product getProductById(int productid);
    boolean addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
}
