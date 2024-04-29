package com.rto.example.RtoManagement;

import java.sql.*;

public class VehicleDetailsDAO {
	public static void addVehicleDetail(VehicleDetails vehicleDetails) throws SQLException {
		String query = "insert into vehicledetails(vehicle_Category,makers_Class,manufacturing_Date,fuel_Used) values(?,?,?,?)";
		
		Connection connection = DBConnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, vehicleDetails.getVehicleCategory());
		preparedStatement.setString(2, vehicleDetails.getMakersClass());
		preparedStatement.setString(3, vehicleDetails.getManufacturingDate());
		preparedStatement.setString(4, vehicleDetails.getFuelUsed());
		preparedStatement.executeUpdate();
	}
	
	public static void showVehicleDetails() throws SQLException {
		String query = "Select * from vehicledetails;";
		Connection connection = DBConnection.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		System.out.println("~~~~~~~~~~~~~~~~~~Registered Vehicles~~~~~~~~~~~~~~~~~~");
		while(resultSet.next()) {
			
			System.out.println("\n    Vehicle id : "+resultSet.getInt(1));
			System.out.println("\n    Vehicle Category : "+resultSet.getString(2));
			System.out.println("      Maker's Class : "+resultSet.getString(3));
			System.out.println("      Manufacturing Date : "+resultSet.getString(4));
			System.out.println("      Type of Vehicle : "+resultSet.getString(5));
			
		}
	}
	
}
