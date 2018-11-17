package com.ting.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	    @OneToMany         //一个用户可以保存多个地址
	    private Address address;
		
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
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
	
	
}
