package com.ting.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * This Class is to set and get customer information
 * @author Ting Liu
 *
 */

public class Customer implements Serializable{
	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name="customerId")
		private int customerId;
	    @Column(name="username")
		private String customerusername;
	    @Column(name="password")
		private String customerpassword;
	    @Column(name="firstname")
		private String customerfirstname;
	    @Column(name="lastname")
		private String customerlastname;
	    @Column(name="email")
		private String customeremail;	
	    @OneToMany(cascade=CascadeType.ALL, mappedBy="customer")         //一个用户可以保存多个地址
	    private Set<Address> addresses;
	    @OneToMany(cascade=CascadeType.ALL, mappedBy="customer")          //一个用户下多个订单
	    private Set<Order> orders;
	    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	    private Cart cart;
	    @OneToMany(cascade=CascadeType.ALL, mappedBy="customer")
	    private Set<Payment> payment;
		
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerusername() {
			return customerusername;
		}
		public void setCustomerusername(String customerusername) {
			this.customerusername = customerusername;
		}
		public String getCustomerpassword() {
			return customerpassword;
		}
		public void setCustomerpassword(String customerpassword) {
			this.customerpassword = customerpassword;
		}
		public String getCustomerfirstname() {
			return customerfirstname;
		}
		public void setCustomerfirstname(String customerfirstname) {
			this.customerfirstname = customerfirstname;
		}
		public String getCustomerlastname() {
			return customerlastname;
		}
		public void setCustomerlastname(String customerlastname) {
			this.customerlastname = customerlastname;
		}
		public String getCustomeremail() {
			return customeremail;
		}
		public void setCustomeremail(String customeremail) {
			this.customeremail = customeremail;
		}
		public Set<Address> getAddresses() {
			return addresses;
		}
		public void setAddresses(Set<Address> addresses) {
			this.addresses = addresses;
		}
		public Set<Order> getOrders() {
			return orders;
		}
		public void setOrders(Set<Order> orders) {
			this.orders = orders;
		}
		public Cart getCart() {
			return cart;
		}
		public void setCart(Cart cart) {
			this.cart = cart;
		}
		public Set<Payment> getPayment() {
			return payment;
		}
		public void setPayment(Set<Payment> payment) {
			this.payment = payment;
		}

	
	    
}
