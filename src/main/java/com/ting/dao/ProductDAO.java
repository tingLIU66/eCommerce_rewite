package com.ting.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ting.entity.Product;
@Transactional
@Repository
public class ProductDAO implements IProductDAO{
	@PersistenceContext	  //get EntityManager object through @PersistenceContext injection
	private EntityManager entityManager;	

	public Product getProductById(int productId) {
		return entityManager.find(Product.class, productId);
	}
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		String hql = "FROM Product as prdt ORDER BY prdt.productId"; //productId should be the same to the instance variable
		return (List<Product>) entityManager.createQuery(hql).getResultList();
	}	
	public void addProduct(Product product) {
		entityManager.persist(product);
	}
	
	public void updateProduct(Product product) {
		Product prdt = getProductById(product.getProductId());
		prdt.setProductName(product.getProductName());
		prdt.setProductDescription(product.getProductDescription());
		prdt.setProductPrice(product.getProductPrice());
		prdt.setProductQuantity(product.getProductQuantity());
		entityManager.flush();
	}
	public void deleteProduct(int productId) {
		entityManager.remove(getProductById(productId));
	}
	public boolean productExists(String productname) {
		String hql = "FROM Product as prdt WHERE prdt.productName = ?1";
		int count = entityManager.createQuery(hql).setParameter(1, productname).getResultList().size();
		return count > 0 ? true : false;
	}
}
