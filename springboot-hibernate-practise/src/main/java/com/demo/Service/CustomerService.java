package com.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Entity.Customer;
import com.demo.Entity.CustomerDetails;
import com.demo.Repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public void saveCustomers(Customer customer) {
		customerRepository.save(customer);
	}
	
	public Customer getCustomer(int i) {
		return customerRepository.getById(i);
	}
	
	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
	}
	
	public Customer getCustomerUsingCustomerDetailsId(int i) {
		return customerRepository.findByCustomerDetailsId(i);
	}
	
	
	
	
}
