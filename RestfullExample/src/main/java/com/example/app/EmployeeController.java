package com.example.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employee")
	public Employee getEmployee() {
		return employeeService.getEmployee();
	}

	@RequestMapping(value = "/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	@RequestMapping(value = "/create/employee", method = RequestMethod.POST)
	public void createEmployee(@RequestBody Employee e) {
		employeeService.createEmployees(e);

	}
	@RequestMapping("/employee/{nam}")
	public Employee searchEmployee(@PathVariable String nam)
	{
		return employeeService.seeEmployee(nam);
	}

}
