package service;

import java.util.List;

import Entity.Product;


public interface IProductService {
    List<Product> getAllProducts();
    Product getProductById(int productid);
    boolean addProducte(Product product);
    void updateproduct(Product product);
    void deleteproduct(int productId);
}
