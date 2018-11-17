package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Entity.Product;
import dao.IProductDAO;

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

	public boolean addProducte(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public void updateproduct(Product product) {
		productDAO.updateProduct(product);
		
	}

	public void deleteproduct(int productId) {
		productDAO.deleteProduct(productId);
		
	}
	
	
	

}
