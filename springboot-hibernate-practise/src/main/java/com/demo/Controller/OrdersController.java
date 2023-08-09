package com.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.Customer;
import com.demo.Entity.CustomerDetails;
import com.demo.Entity.Orders;
import com.demo.Service.CustomerService;
import com.demo.Service.OrdersService;

@RestController
public class OrdersController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	OrdersService ordersService;
	
	@RequestMapping(value="/saveOrders")
	public void saveOrders() {
		
		Customer customer=customerService.getCustomer(3);
		
		Orders order1=new Orders();
		order1.setName("biryani");
		order1.setPrice(150);
		order1.setCustomer(customer);
		
		Orders order2=new Orders();
		order2.setName("pizza");
		order2.setPrice(120);
		order2.setCustomer(customer);
		
		ArrayList<Orders> orders=new ArrayList<Orders>();
		orders.add(order1);
		orders.add(order2);
		
		
		
		//customer.getName();
		//System.out.println("name :: "+customer.getName());
		
		customer.setOrders(orders);
		customerService.saveCustomers(customer);
		
	}
	
	@RequestMapping(value="/saveCustomerFromOrders")
	public void saveCustomerFromOrders() {
		Orders orders=new Orders();
		orders.setName("chicken chilli");
		orders.setPrice(190);
		Customer customer=new Customer();
		customer.setName("venu");
		CustomerDetails customerDetails =new CustomerDetails();
		customerDetails.setEmail("venu@gmail.com");
		customerDetails.setAddress("mumbai");
		customerDetails.setPhone("5457898457");
		customer.setCustomerDetails(customerDetails);
		//orders.setCustomer(new Customer(1,"ramu"));
		orders.setCustomer(customer);
		ordersService.saveOrders(orders);
		
	}
	
	@RequestMapping(value="/getMaxOrderPrice")
	public Integer getMaxOrderPrice() {
		Integer maxPrice= ordersService.getMaxOrderPrice();
		return maxPrice;
	}
	
	@RequestMapping(value="/getOrderPriceinDescendingOrder")
	public List<Integer> getOrderPriceinDescendingOrder() {
		return ordersService.getOrderPriceinDescendingOrder();
		
	}
	
	@RequestMapping(value="/getOrderObjectWithoutCustomer")
	public List<Orders> getOrderObjectWithoutCustomer() {
		
		return ordersService.getOrderObjectWithoutCustomer();
		
	}
	
	
	
	
	

}
