package com.rto.example.RtoManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LicenseDetailsDAO {
	public static void addLicenseDetails(LicenseDetails licenseDetails) throws SQLException {
		String query = "insert into licensedetails values(?,?,?,?)";
		
		Connection connection = DBConnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, licenseDetails.getState());
		preparedStatement.setString(2, licenseDetails.getNewlicenseNumber());
		preparedStatement.setString(3, licenseDetails.getIssuedDate());
		preparedStatement.setString(4, licenseDetails.getExpiredDate());
		
		
		preparedStatement.executeUpdate();
	}

}
