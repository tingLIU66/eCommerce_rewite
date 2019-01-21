package com.ting.dao;

import java.util.List;

import com.ting.entity.Customer;

public interface ICustomerDAO {
	
    List<Customer> getAllCustomers();
    Customer getCustomerById(int customerid);
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int customerId);
   //	boolean customerExists(String customername);

}
