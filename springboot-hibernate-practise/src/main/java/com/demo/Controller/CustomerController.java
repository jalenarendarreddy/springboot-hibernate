package com.demo.Controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.Entity.Customer;
import com.demo.Entity.CustomerDetails;
import com.demo.Entity.Orders;
import com.demo.Service.CustomerDetailsService;
import com.demo.Service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	CustomerDetailsService customerDetailsService;
	
	@RequestMapping(value="/")
	public String WelcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value="/addCustomer")
	public String addCustomer() {
		return "addCustomer";
	}
	
	@RequestMapping(value="/addCustomerDetails")
	public String addCustomerDetails() {
		return "addCustomerDetails";
	}
	
	@RequestMapping(value="/saveCustomer")
	public void saveCustomer(HttpServletRequest request,HttpServletResponse response) {
		String name=request.getParameter("name");
		Customer customer=new Customer();
		customer.setName(name);
		int i=2;
			
	//CustomerDetails customerDetails=customerDetailsService.getCustomerDetailsById(i);
	//System.out.println("customerDetails :: "+customerDetails.getAddress());
		CustomerDetails customerDetails=new CustomerDetails();
		customerDetails.setEmail("ravi@gmail.com");
		customerDetails.setPhone("6654125698");
		customerDetails.setAddress("bengloor");
	
	customer.setCustomerDetails(customerDetails);
	customerService.saveCustomers(customer);
		
	}
	
	@RequestMapping(value="/getCustomerDetailsFromCustomer")
	public void getCustomerDetailsFromCustomer() {

		int i=2;		
		Customer customer=customerService.getCustomer(i);
		//customer.getCustomerDetails().getPhone();
		//System.out.println("phone :: "+customer.getCustomerDetails().getPhone());
		customerService.deleteCustomer(customer);
		
		
	}
	
	@RequestMapping(value="/deleteCustomerAlongWithOrders")
	public void deleteCustomerAlongWithOrders() {
		Customer customer=customerService.getCustomer(5);
		customerService.deleteCustomer(customer);
	}
	
	@RequestMapping(value="/getCustomerUsingCustomerDetailsId")
	public void getCustomerUsingCustomerDetailsId() {
		int i=5;
		Customer customer=customerService.getCustomerUsingCustomerDetailsId(i);
		
		System.out.println("customer id ::"+customer.getId()+"customer name ::"+ customer.getName());
		
	}
	


}
