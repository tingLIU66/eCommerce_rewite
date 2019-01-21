package com.ting.service;

import java.util.List;

import com.ting.entity.Customer;

public interface ICustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(int customerid);
    boolean addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int customerId);
}
