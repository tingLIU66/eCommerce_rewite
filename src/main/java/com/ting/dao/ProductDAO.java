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
	@PersistenceContext	  //通过@PersistenceContext注释注入方式获得EntityManager对象
	private EntityManager entityManager;	

	public Product getProductById(int productId) {
		return entityManager.find(Product.class, productId);
	}
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		String hql = "FROM Product as prdt ORDER BY prdt.ProductID";
		return (List<Product>) entityManager.createQuery(hql).getResultList();
	}	
	public void addProduct(Product product) {
		entityManager.persist(product);
	}
	
	public void updateProduct(Product product) {
		Product prdt = getProductById(product.getProductId());
		prdt.setProductname(product.getProductname());
		prdt.setProductdecription(product.getProductdecription());
		prdt.setProductprice(product.getProductprice());
	//	prdt.setProductownerID(product.getProductownerID());
		prdt.setProductquantity(product.getProductquantity());
		entityManager.flush();
	}
	public void deleteProduct(int productId) {
		entityManager.remove(getProductById(productId));
	}
/*	public boolean productExists(String title, String category) {
		String hql = "FROM Product as atcl WHERE atcl.title = ? and atcl.category = ?";
		int count = entityManager.createQuery(hql).setParameter(1, title)
		              .setParameter(2, category).getResultList().size();
		return count > 0 ? true : false;
	}*/



}
