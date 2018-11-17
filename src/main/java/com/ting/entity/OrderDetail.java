package com.ting.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderDetail {
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="orderdetailId") 
	private int orderdetailId;
	private int pId;
	private double pprice;
	private int pquantity;	

	public int getOrderdetailId() {
		return orderdetailId;
	}
	public void setOrderdetailId(int orderdetailId) {
		this.orderdetailId = orderdetailId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	
	
	

}
