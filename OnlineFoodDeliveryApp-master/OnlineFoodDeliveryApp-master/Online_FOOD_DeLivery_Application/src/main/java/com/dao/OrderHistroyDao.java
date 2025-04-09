package com.dao;

import java.util.List;

import com.model.OrderHistory;

public interface OrderHistroyDao {

	void addOrderHistoryItem(OrderHistory orderHistory);

	OrderHistory getOrderHistroyItem(int orderHistoryId);

	void updateOrderHistroyItem(OrderHistory orderHistory);

	void deleteOrderHistroyItem(int orderHistoryId);

	List<OrderHistory> getAll();

}