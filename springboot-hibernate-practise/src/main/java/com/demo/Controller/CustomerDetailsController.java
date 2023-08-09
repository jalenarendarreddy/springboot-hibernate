package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.Entity.CustomerDetails;
import com.demo.Service.CustomerDetailsService;

@Controller
public class CustomerDetailsController {
	
	@Autowired
	CustomerDetailsService customerDetailsService;
	
	@RequestMapping(value="/saveCustomerDetails")
	public void saveCustomerDetails(@RequestParam("email") String email,@RequestParam("phone") String phone,@RequestParam("address") String address) {
		
		CustomerDetails customerDetails=new CustomerDetails();
		customerDetails.setEmail(email);
		customerDetails.setPhone(phone);
		customerDetails.setAddress(address);
		
		customerDetailsService.saveCustomerDetails(customerDetails);
		
		
	}
	
	@RequestMapping(value="/getCustomerFromCustomerDetails")
	public void getCustomerFromCustomerDetails() {
		
	CustomerDetails customerDetails=customerDetailsService.getCustomerDetailsById(1);
	//customerDetails.getCustomer().getName();
	//System.out.println("name :: "+ customerDetails.getCustomer().getName());
	customerDetailsService.deleteCustomerDetails(customerDetails);
	}

}
