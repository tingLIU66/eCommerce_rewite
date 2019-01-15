package com.ting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ting.dao.IProductDAO;
import com.ting.entity.Product;
@Service
public class ProductService implements IProductService{
	@Autowired
	private IProductDAO productDAO;

	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();		
	}

	public Product getProductById(int productid) {
		Product product = productDAO.getProductById(productid);
		return product;
	}

	public boolean addProduct(Product product) {
	      if (productDAO.productExists(product.getProductName())) {
	    	   return false;
	       } else {
	    	   productDAO.addProduct(product);
	    	   return true;
	       }
	}

	public void updateProduct(Product product) {
		productDAO.updateProduct(product);
		
	}

	public void deleteProduct(int productId) {
		productDAO.deleteProduct(productId);
		
	}
	
	
	

}
