package com.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Entity.Orders;
import com.demo.Repository.OrdersRepository;

@Service
public class OrdersService {
	
	@Autowired
	OrdersRepository ordersRepository;
	
	public void saveOrders(Orders orders ) {
		ordersRepository.save(orders);
	}
	
	public Integer getMaxOrderPrice() {
		return ordersRepository.getMaxOrderPrice();
	}
	
	public List<Integer> getOrderPriceinDescendingOrder() {
		return ordersRepository.getOrderPriceinDescendingOrder();
		
	}
	
	public List<Orders> getOrderObjectWithoutCustomer() {
		return ordersRepository.getOrderObjectWithoutCustomer();
	}
	

}
