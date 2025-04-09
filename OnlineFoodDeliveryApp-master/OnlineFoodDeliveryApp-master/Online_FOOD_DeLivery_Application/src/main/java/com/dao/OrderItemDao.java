package com.dao;

import java.util.List;

import com.model.OrderItem;

public interface OrderItemDao {

	void addOrderItem(OrderItem orderItem);

	OrderItem getOrderItem(int orderItemId);

	void UpdateOrderItem(OrderItem orderItem);

	List<OrderItem> getAllOrderItemsByUserId(int userid);

	void deleteOrderItem(int orderItemId);

	List<OrderItem> getAll();

	List<OrderItem> getAllByOrderId(int orderId);

}