package com.demo.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.Entity.Employee;
import com.demo.Entity.Project;
import com.demo.Service.ProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@RequestMapping(value="/saveProjectAlongWithEmployees")
	public void saveProjectAlongWithEmployees() {
		
		Project project=new Project();
		project.setName("T2");
		
		Employee employee1=new Employee();
		employee1.setName("advani");
		employee1.setEmail("advani@gmail.com");
		
		Employee employee2=new Employee();
		employee2.setName("praveen");
		employee2.setEmail("praveen@gmail.com");
		
		ArrayList<Employee> employee=new ArrayList<>();
		employee.add(employee1);
		employee.add(employee2);
		
		project.setEmployee(employee);
		projectService.saveProject(project);
		
		
	}

}
