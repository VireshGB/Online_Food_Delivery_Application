package com.daoimplementations;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.model.AgentOrders;
import com.model.DeliveryAgentOrders;
import com.model.Order;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		OrderDaoImpl o = new OrderDaoImpl();
		List<Order> a = o.getOrderbyuid(19);
		for (Order aa : a) {
			System.out.println(aa);
		}
	}

}