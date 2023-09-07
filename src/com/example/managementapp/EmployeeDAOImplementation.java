package com.example.managementapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		con = DBConnection.createDBConnection();
		String query = "select * from employee";
		System.out.println("Employee Details");
		System.out.println("----------------------------------");
		System.out.format("%s\t%s\t%s\t%s\n","ID","Name","Salary","Age");
		System.out.println("----------------------------------");
		try {
			Statement stm = con.createStatement();
			ResultSet result = stm.executeQuery(query);
			
			while(result.next()) {
				System.out.format("%d\t%s\t%f\t%d\n", result.getInt(1),
						result.getString(2),
						result.getDouble(3),
						result.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showEmployeeBasedOnId(int id ) {
		con = DBConnection.createDBConnection();
		String query = "select * from employee where id ="+id;
		System.out.println("Employee Details based on ID");
		System.out.println("----------------------------------");
		System.out.format("%s\t%s\t%s\t%s\n","ID","Name","Salary","Age");
		System.out.println("----------------------------------");
		try {
			Statement stm = con.createStatement();
			ResultSet result = stm.executeQuery(query);
			while(result.next()) {
				System.out.format("%d\t%s\t%f\t%d\n", result.getInt(1),
						result.getString(2),
						result.getDouble(3),
						result.getInt(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateEmployee(int id, String name) {
		con = DBConnection.createDBConnection();
		String query = "update employee set name=? where id =?";
		
		try {
			PreparedStatement pstm= con.prepareStatement(query);
			pstm.setString(1, name);
			pstm.setInt(2, id);
			int count = pstm.executeUpdate();
			if(count!=0) System.out.println("Employee Details updated sucessfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

}
