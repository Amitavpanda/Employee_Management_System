package com.example.managementapp;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		String name;
		int id;
		EmployeeDAO dao = new EmployeeDAOImplementation();
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Management Application");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Add Employee\n" +
					"2. Show All Employee\n" +
					"3. Show Employee based on id \n" +
					"4. Update the employee\n" +
					"5. Delete the employee\n"+
					"6. Close the application");
			
			System.out.println("Enter the choice");
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1:	
					Employee emp = new Employee();
					System.out.println("Enter id");
					id = sc.nextInt();
					System.out.println("Enter name");
					name = sc.next();
					System.out.println("Enter salary");
					double salary = sc.nextDouble();
					System.out.println("Enter age");
					int age = sc.nextInt();
					
					emp.setId(id);
					emp.setName(name);
					emp.setSalary(salary);
					emp.setAge(age);
					dao.createEmployee(emp);
					break;
				case 2 :
					dao.showAllEmployees();
					break;
				case 3 : 
					System.out.println("Enter Id to get the employee details");
					int empid = sc.nextInt();
					dao.showEmployeeBasedOnId(empid);
					break;
				case 4:
					System.out.println("Enter the id to update the employee details");
					System.out.println("Enter the id");
					id = sc.nextInt();
					System.out.println("enter the new name");
					name = sc.next();
					dao.updateEmployee(id, name);
					break;
				case 6:
					System.out.println("Thanks for using our application");
					System.exit(0);
				default:
					System.out.println("Enter valid choice");
					break;
			}
			
		}while(true);
	}

}
