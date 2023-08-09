package com.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Entity.CustomerDetails;
import com.demo.Repository.CustomerDetailsRepository;

@Service
public class CustomerDetailsService {
	
	@Autowired
	CustomerDetailsRepository customerDetailsRepository;
	
	public void saveCustomerDetails(CustomerDetails customerDetails) {
		customerDetailsRepository.save(customerDetails);
	}
	
	public CustomerDetails getCustomerDetailsById(int i) {
		return customerDetailsRepository.getById(i);
	}
	
	public void deleteCustomerDetails(CustomerDetails customerDetails) {
		customerDetailsRepository.delete(customerDetails);
	}
	

}
