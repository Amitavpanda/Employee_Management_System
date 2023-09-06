package com.example.managementapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAOImplementation implements EmployeeDAO {
	Connection con;
	
	@Override
	public void createEmployee(Employee emp) {
		
		con = DBConnection.createDBConnection();
		String query = "insert into employee values(?,?,?,?)";
		
		
		
		try {
			PreparedStatement ptsm = con.prepareStatement(query);
			ptsm.setInt(1,emp.getId());
			ptsm.setString(2,emp.getName());
			ptsm.setDouble(3, emp.getSalary());
			ptsm.setInt(4,emp.getAge());
			
			int cnt = ptsm.executeUpdate();
			if(cnt!=0) System.out.println("Employee Inserted Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void showAllEmployees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showEmployeeBasedOnId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

}
