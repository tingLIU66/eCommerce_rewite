package com.ting.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="orderId")
	private int orderId;
	private String orderdate;
	private float totalprice;
	private float tax;
	private float amount;	
	private String orderstatus;
	@OneToOne
	private Address shippingaddress;
	@OneToOne
	private OrderDetail orderdetail;
	@ManyToOne                 //可以是多个订单对应一个用户
	private Customer costomer;
	
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
	public Customer getCostomer() {
		return costomer;
	}
	public void setCostomer(Customer costomer) {
		this.costomer = costomer;
	}
	
	
	
	
	

}
