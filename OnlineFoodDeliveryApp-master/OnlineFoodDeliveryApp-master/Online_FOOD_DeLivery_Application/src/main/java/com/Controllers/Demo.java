
package com.Controllers;

import java.util.List;

import com.daoimplementations.OrderItemDaoImpl;
import com.model.OrderItem;

public class Demo {

	public static void main(String[] args) {
		OrderItemDaoImpl rest = new OrderItemDaoImpl();
		List<OrderItem> al = rest.getAll();
		System.out.println(al);
	}

}