package com.ting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ting.dao.ICustomerDAO;
import com.ting.entity.Customer;

public class CustomerService implements ICustomerService{
	@Autowired
	private ICustomerDAO customerDAO;

	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();		
	}

	public Customer getCustomerById(int customerid) {
		Customer customer = customerDAO.getCustomerById(customerid);
		return customer;
	}

	public boolean addCustomer(Customer customer) {
	      if (customerDAO.customerExists(customer.getCustomeremail())) {
	    	   return false;
	       } else {
	    	   customerDAO.addCustomer(customer);
	    	   return true;
	       }
	}

	public void updateCustomer(Customer customer) {
		customerDAO.updateCustomer(customer);
		
	}

	public void deleteCustomer(int customerId) {
		customerDAO.deleteCustomer(customerId);
		
	}
	
	

}
