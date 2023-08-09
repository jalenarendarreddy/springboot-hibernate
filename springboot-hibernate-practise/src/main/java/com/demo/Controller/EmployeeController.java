package com.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.Entity.Employee;
import com.demo.Entity.Project;
import com.demo.Service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/saveEmployeeAlongWithProjects")
	public void saveEmployeeAlongWithProjects() {
		
		Project project1 = new Project();
		project1.setName("elps");
		
		Project project2 = new Project();
		project2.setName("restaurant");
		
		ArrayList<Project> project = new ArrayList<>();
		project.add(project1);
		project.add(project2);
		
		Employee employee = new Employee();
		employee.setName("jai");
		employee.setEmail("jai@gmail.com");
		employee.setProject(project);
		employeeService.saveEmployee(employee);
		
	}
	
	@RequestMapping(value="/deleteEmployee")
	public void deleteEmployee() {
		
		int id=6;
		Employee employee=employeeService.getEmployee(id);
		//System.out.println("name :: "+ employee.getName());
		employeeService.deleteEmployee(employee);
		
	}
	
	@RequestMapping(value="/getAllEmployees")
	public ModelAndView getAllEmployees(ModelAndView modelAndView) {
		
		List<Employee> employee=employeeService.getAllEmployees();
		
		/*for(Employee emp:employee) {
			System.out.println(emp.getName()+" "+emp.getEmail());
		}*/
		
		modelAndView.addObject("emp", employee);
		modelAndView.setViewName("showEmployees");
		return modelAndView;
		
	}

}
