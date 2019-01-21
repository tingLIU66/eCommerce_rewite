package com.ting.dao;

import com.ting.entity.Order;

public interface IOrderDAO {

	Order getOrderById(int orderid);
	void fullfillOrder(int orderid);
	void shipOrder();
	void cancelOrder(int orderid);
	String checkStatus(int orderid);
	void refund(int orderid);
}
