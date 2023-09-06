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
					dao.createEmployee();
					break;
				case 2:
					System.out.println("Thanks for using our application");
					System.exit(0);
				default:
					System.out.println("Enter valid choice");
					break;
			}
			
		}while(true);
	}

}
