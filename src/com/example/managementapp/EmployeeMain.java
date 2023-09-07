package com.example.managementapp;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImplementation();
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Management Application");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Add Employee\n" +
					"2. Show All Employee\n" +
					"3. Show Employee based on id \n" +
					"4. Update the employee\n" +
					"5. Delet the employee\n");
			
			System.out.println("Enter the choice");
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1:	
					Employee emp = new Employee();
					System.out.println("Enter id");
					int id = sc.nextInt();
					System.out.println("Enter name");
					String name = sc.next();
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
