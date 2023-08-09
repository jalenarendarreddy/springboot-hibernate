package com.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Entity.Employee;
import com.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}
	
	public Employee getEmployee(int id) {
		return employeeRepository.getById(id);
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
		
	}

}
