package com.ting.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ting.entity.Customer;


public class CustomerDAO implements ICustomerDAO{
	@PersistenceContext	  //get EntityManager object through @PersistenceContext injection
	private EntityManager entityManager;	

	public Customer getCustomerById(int customerId) {
		return entityManager.find(Customer.class, customerId);
	}
	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers() {
		String hql = "FROM Customer as cstm ORDER BY cstm.customerId"; //customerId should be the same to the instance variable
		return (List<Customer>) entityManager.createQuery(hql).getResultList();
	}	
	public void addCustomer(Customer customer) {
		entityManager.persist(customer);
	}
	
	public void updateCustomer(Customer customer) {
		Customer cstm = getCustomerById(customer.getCustomerId());
		cstm.setCustomerfirstname(customer.getCustomerfirstname());
		cstm.setCustomerlastname(customer.getCustomerlastname());
		cstm.setAddresses(customer.getAddresses());
		cstm.setCustomerpassword(customer.getCustomerpassword());
		cstm.setCustomeremail(customer.getCustomeremail());
		cstm.setCustomerusername(customer.getCustomerusername());
		cstm.setPayment(customer.getPayment());
	
		entityManager.flush();
	}
	public void deleteCustomer(int customerId) {
		entityManager.remove(getCustomerById(customerId));
		
		
	}
	/*public boolean customerExists(String customername) {
		String hql = "FROM Customer as cstm WHERE cstm.customerName = ?1";
		int count = entityManager.createQuery(hql).setParameter(1, customername).getResultList().size();
		return count > 0 ? true : false;
	}*/
}
