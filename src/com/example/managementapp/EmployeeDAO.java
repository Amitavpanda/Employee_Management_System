package com.example.managementapp;

public interface EmployeeDAO {
	
	
//	create employees
	public void createEmployee(Employee emp);
	
//	show all employees 
	public void showAllEmployees();
	
//	show employee based on id
	public void showEmployeeBasedOnId();
	
	
//  update employee
	public void updateEmployee(int id, String name);
//	delete employee
	public void deleteEmployee(int id);
}
