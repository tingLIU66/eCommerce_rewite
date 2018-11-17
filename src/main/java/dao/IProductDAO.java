package dao;

import java.util.List;

import Entity.Product;

public interface IProductDAO {
    List<Product> getAllProducts();
    Product getProductById(int productid);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
   // boolean productExists(String title, String category);
}
