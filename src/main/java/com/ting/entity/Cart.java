package com.ting.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Cart {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="cartId") 
	private int cartId;
    @Column(name="cartprice") 
	private double cartprice;
    @Column(name="cartquantity") 
	private int cartquantity;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="cart") 
   	private Set<Product> products;
    @OneToOne
    @MapsId
	private Customer customer;
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getCartprice() {
		return cartprice;
	}
	public void setCartprice(double cartprice) {
		this.cartprice = cartprice;
	}
	public int getCartquantity() {
		return cartquantity;
	}
	public void setCartquantity(int cartquantity) {
		this.cartquantity = cartquantity;
	}
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
