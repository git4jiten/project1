package com.example.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	List<Employee> empLst = new ArrayList<>(Arrays.asList(new Employee("jiten", "irving", "12346"),
			new Employee("purna", "dallas", "56678")));

	public List<Employee> getEmployees() {

		return empLst;

	}

	public void createEmployees(Employee e) {
		empLst.add(e);

	}
	
	public Employee seeEmployee(String namee)
	{
		return empLst.stream().filter(a->a.getName().equals(namee)).findFirst().get();
				}

	public Employee getEmployee() {
		Employee e = new Employee("ashis", "dallas", "4564");
		return e;
	}

}
