package com.rto.example.RtoManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class GenerateLicenseDAO {

	public static void addGenerateLicense(GenerateLicense license) throws SQLException {
		String query = "insert into generatelicense(firstname,lastname,contact,address,typeofvehicle,age) values(?,?,?,?,?,?)";
		
		Connection connection = DBConnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, license.getFirstName());
		preparedStatement.setString(2, license.getLastName());
		preparedStatement.setString(3, license.getContactNumber());
		preparedStatement.setString(4, license.getAddress());
		preparedStatement.setString(5, license.getTypeOfVehicle());
		preparedStatement.setInt(6, license.getAge());
		
		preparedStatement.executeUpdate();
	}
	
	public static void updateDetails(int userid,String firstname,String lastname,String contact,String address) throws SQLException {
		String queryString="select user_id from generatelicense where user_id = ?;";
		Connection connection = DBConnection.getConnection();
		PreparedStatement preparedStatement1 = connection.prepareStatement(queryString);
		preparedStatement1.setInt(1, userid);
		
		int id=0;
		
		ResultSet resultSet= preparedStatement1.executeQuery();
		while(resultSet.next()) {
			id=resultSet.getInt(1);
		}
		if(id==0) {
			System.out.println("No user found!!");
			return;
		}
		
		String query1 = "update generatelicense set firstname = ? , lastname = ? , contact = ? , address = ? where user_id = ?;";
		Connection connection1 = DBConnection.getConnection();
		PreparedStatement preparedStatement = connection1.prepareStatement(query1);
		preparedStatement.setString(1, firstname);
		preparedStatement.setString(2, lastname);
		preparedStatement.setString(3, contact);
		preparedStatement.setString(4, address);
		preparedStatement.setInt(5, userid);
		
		preparedStatement.executeUpdate();
		System.out.println("Updated successfully!!");
		}
	
	

	public static void generateLicense(int userid, String state, String issuedDate, String expiredDate) throws SQLException {
		String stateTwoLetters="";
        String generatingLicenseNumber="";
		
		String query1="select user_id from generatelicense where user_id = ?;";
		Connection connection1=DBConnection.getConnection();
		PreparedStatement preparedStatement1 = connection1.prepareStatement(query1);
		preparedStatement1.setInt(1, userid);
		ResultSet resultSet= preparedStatement1.executeQuery();
		int id =0;
		while(resultSet.next()) {
			id= resultSet.getInt(1);
		}
		if(id==0) {
			System.out.println("User id not found!!");
			return;
		}
		else {
			
		Random rand = new Random();
            
            switch (state) {
                case "TAMILNADU":
                    stateTwoLetters = "TN";
                    generatingLicenseNumber = stateTwoLetters +"11Z" +(rand.nextInt(9000) + 1000);
                    System.out.println("Generated License Number: " + generatingLicenseNumber);
                    break;
                case "ANDHRAPRADESH":
                    stateTwoLetters = "AP";
                    generatingLicenseNumber = stateTwoLetters +"12Z" +(rand.nextInt(9000) + 1000);
                    System.out.println("Generated License Number: " + generatingLicenseNumber);
                    break;
                case "MADHYAPRADESH":
                    stateTwoLetters = "MP";
                    generatingLicenseNumber = stateTwoLetters +"13Z" +(rand.nextInt(9000) + 1000);
                    System.out.println("Generated License Number: " + generatingLicenseNumber);
                    break;
                case "KARNATAKA":
                    stateTwoLetters = "KA";
                    generatingLicenseNumber = stateTwoLetters +"14Z" +(rand.nextInt(9000) + 1000);
                    System.out.println("Generated License Number: " + generatingLicenseNumber);
                    break;
                case "KERALA":
                    stateTwoLetters = "KL";
                    generatingLicenseNumber = stateTwoLetters +"15Z" +(rand.nextInt(9000) + 1000);
                    System.out.println("Generated License Number: " + generatingLicenseNumber);
                    break;
            }
           }
            
            String queryString = "update generatelicense set license_number = ? where user_id = ?;";
            Connection connection2 = DBConnection.getConnection();
            PreparedStatement preparedStatement2 = connection2.prepareStatement(queryString);
            preparedStatement2.setString(1, generatingLicenseNumber);
            preparedStatement2.setInt(2, userid);
            preparedStatement2.executeUpdate();
        } 
	
	public static void showDetails() throws SQLException {
		String query = "Select * from generatelicense;";
		Connection connection = DBConnection.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		System.out.println("~~~~~~~~~~~~~~~~~~License Holders Details~~~~~~~~~~~~~~~~~~");
		while(resultSet.next()) {
			
			System.out.println("\n Name : "+resultSet.getString(2)+" "+resultSet.getString(3));
			System.out.println(" Contact : "+resultSet.getString(4));
			System.out.println(" Address : "+resultSet.getString(5));
			System.out.println(" Type of Vehicle : "+resultSet.getString(6));
			System.out.println(" Age : "+resultSet.getInt(7));
			System.out.println(" License Number : "+resultSet.getString(8));
			System.out.println(" License Issued Date : "+resultSet.getString(9));
			System.out.println(" License Expired Date : "+resultSet.getString(10));
		}
	}
	
	public static void showParticularDetails(int userid) throws SQLException {
		String query = "Select * from generatelicense where user_id = ?;";
		Connection connection = DBConnection.getConnection();
		PreparedStatement preparedStatement2 = connection.prepareStatement(query);
        preparedStatement2.setInt(1, userid);
		ResultSet resultSet = preparedStatement2.executeQuery();
		System.out.println("~~~~~~~~~~~~~~~~~~License Holders Details~~~~~~~~~~~~~~~~~~");
		while(resultSet.next()) {
			
			System.out.println("\n Name : "+resultSet.getString(2)+" "+resultSet.getString(3));
			System.out.println(" Contact : "+resultSet.getString(4));
			System.out.println(" Address : "+resultSet.getString(5));
			System.out.println(" Type of Vehicle : "+resultSet.getString(6));
			System.out.println(" Age : "+resultSet.getInt(7));
			System.out.println(" License Number : "+resultSet.getString(8));
		}
	}
	
    }


