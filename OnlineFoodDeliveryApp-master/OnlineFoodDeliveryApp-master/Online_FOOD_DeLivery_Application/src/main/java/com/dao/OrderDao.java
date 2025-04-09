package com.dao;

import java.util.List;

import com.model.Order;

public interface OrderDao {

	void addOrder(Order order);

	Order getOrder(int orderId);

	void updateOrder(Order order);

	void deleteOrder(int orderId);

	List<Order> getAll();

	int getOrder(Order order);

	List<Order> getOrderbyuid(int userid);

}