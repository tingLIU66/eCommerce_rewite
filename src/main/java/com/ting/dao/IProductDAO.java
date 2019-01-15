package com.ting.dao;

import java.util.List;

import com.ting.entity.Product;

public interface IProductDAO {
    List<Product> getAllProducts();
    Product getProductById(int productid);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
   	boolean productExists(String productname);
}
