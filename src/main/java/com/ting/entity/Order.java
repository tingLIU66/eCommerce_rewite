package com.ting.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="orderId")
	private int orderId;
	@Column(name="orderdate")
	private String orderdate;
	@Column(name="totalprice")
	private float totalprice;
	@Column(name="tax")
	private float tax;
	@Column(name="amount")
	private float amount;
	@Column(name="orderstatus")
	private String orderstatus;
	@ManyToOne  //多个订单可以下到一个地址
	@JoinColumn(name="addressId")
	private Address shippingaddress;
	@OneToOne(mappedBy="order",cascade = CascadeType.ALL, orphanRemoval = true )
	private OrderDetail orderdetail;
	@ManyToOne                 //可以是多个订单对应一个用户
	@JoinColumn(name="customerId")
	private Customer customer;
	@OneToOne(mappedBy="order",cascade = CascadeType.ALL, orphanRemoval = true )
	private Payment payment;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public Address getShippingaddress() {
		return shippingaddress;
	}
	public void setShippingaddress(Address shippingaddress) {
		this.shippingaddress = shippingaddress;
	}
	public OrderDetail getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(OrderDetail orderdetail) {
		this.orderdetail = orderdetail;
	}

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
	
	
	

}
