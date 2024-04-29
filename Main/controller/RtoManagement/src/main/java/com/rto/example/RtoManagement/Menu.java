package com.rto.example.RtoManagement;

import java.sql.*;

import java.time.LocalDate;

//import java.awt.print.Printable;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Menu {

	@SuppressWarnings({ "resource", "unused" })
	public static void addVehicleDetails() throws SQLException {
		
		String vehicleCategory="";
		String makersClass = "";
		String manufacturingDate="";
		String fuelUsed="";
		YearMonth yearMonth = null;
		
		Scanner scanner = new Scanner(System.in);
		while(true) 
		{
		    System.out.println("Enter a Vehicle Category");
		    vehicleCategory = scanner.next();
		    if (vehicleCategory.equalsIgnoreCase("TWO")) 
		    {
		        while(true) 
		        {
		            System.out.println("Enter a Maker's Class");
		            makersClass = scanner.next();
		            
		            if (makersClass.matches("^[a-zA-Z]+$") && makersClass.equalsIgnoreCase("KAWASAKIBIKE")|| makersClass.equalsIgnoreCase("HONDABIKE")|| makersClass.equalsIgnoreCase("KTMBIKE") || makersClass.equalsIgnoreCase("ROYALENFIELDBIKE")|| makersClass.equalsIgnoreCase("BMWBIKE")||
		                    makersClass.equalsIgnoreCase("YAMAHABIKE")|| makersClass.equalsIgnoreCase("HEROBIKE")|| makersClass.equalsIgnoreCase("DUKEBIKE")|| makersClass.equalsIgnoreCase("OLABIKE")||
		                    makersClass.equalsIgnoreCase("TVSBIKE")|| makersClass.equalsIgnoreCase("SUZUKIBIKE")|| makersClass.equalsIgnoreCase("BAJAJBIKE")|| makersClass.equalsIgnoreCase("PULSARBIKE")|| makersClass.equalsIgnoreCase("ATHERBIKE")) 
		            {
		                break;
		            } 
		            else {
		                System.out.println("Please provide a valid Maker's Class for Bike");
		            }
		        }
		        break;
		    }
		    else if(vehicleCategory.equalsIgnoreCase("FOUR")) 
		    {
		        while(true) 
		        {
		            System.out.println("Enter a Maker's Class");
		            makersClass = scanner.next();
		            
		            if (makersClass.matches("^[a-zA-Z]+$") && makersClass.equalsIgnoreCase("MARUTHISUZUKI")|| makersClass.equalsIgnoreCase("HYUNDAI")|| makersClass.equalsIgnoreCase("MARUTHI") || makersClass.equalsIgnoreCase("KIA")|| makersClass.equalsIgnoreCase("BMW")||
		                    makersClass.equalsIgnoreCase("AUDI")|| makersClass.equalsIgnoreCase("BENZ")|| makersClass.equalsIgnoreCase("LAMBORGHINI")|| makersClass.equalsIgnoreCase("TESLA")||
		                    makersClass.equalsIgnoreCase("TATA")|| makersClass.equalsIgnoreCase("TOYOTA")|| makersClass.equalsIgnoreCase("HONDA")|| makersClass.equalsIgnoreCase("XUV")|| makersClass.equalsIgnoreCase("MAHINDRA")) 
		            {
		                break;
		            } 
		            else 
		            {
		                System.out.println("Please provide a valid Maker's Class for Car");
		            }
		        }
		        break;
		    }
		    else 
		    {
		        System.out.println("Please Enter a valid Vehicle Type!!");
		    }
		}


		//---------------------------------------------
		while(true) 
		{
			System.out.println("Enter the Vehicle Manufacturing Date");
			manufacturingDate = scanner.next();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
			try
			
			{
			    yearMonth = YearMonth.parse(manufacturingDate, formatter);
			   // System.out.println(yearMonth);
			    break;
			} catch (DateTimeParseException e)
			{
			    System.out.println("Please provide a valid Date Format (yyyy-MM)");
			}
		}

		//-------------------------------------------------
		while(true) {
			System.out.println("Enter a Vehicle's Fuel Used:");
			fuelUsed =  scanner.next();
			if (fuelUsed.equalsIgnoreCase("PETROL") || fuelUsed.equalsIgnoreCase("DIESEL") || fuelUsed.equalsIgnoreCase("EV")) 
			{
			   // System.out.println(FuelUsed);
				break;
			} else 
			{
			    System.out.println("Enter a valid Fuel Type");
			}
		}
		VehicleDetails vehicleDetails = new VehicleDetails(vehicleCategory, makersClass, manufacturingDate, fuelUsed);
		VehicleDetailsDAO.addVehicleDetail(vehicleDetails);
	}
	
	public static void showVehicleDetails() throws SQLException {
		VehicleDetailsDAO.showVehicleDetails();
	}
	
	@SuppressWarnings("resource")
	public static void addGenerateLicenses() throws SQLException{
		String firstName="";
		String lastName="";
		String contactNumber="";
		String address = "";
		String typeOfVehicle = "";
		int age;
		Scanner scanner = new Scanner(System.in);
		while(true) 
		{
			System.out.println("Enter a First Name:");
			firstName = scanner.next();
			if (firstName.matches("^[a-zA-Z]+$")) 
			{
				break;
			}else
			{
				System.out.println("Please Enter a valid First Name");
			}
		}
		
		while(true) 
		{
			System.out.println("Enter a Last Name:");
			lastName = scanner.next();
			if (lastName.matches("^[a-zA-Z]+$")) 
			{
				break;
			}else 
			{
				System.out.println("Please Enter a valid Last Name");
			}
		}
		
		
		while(true)
		{
			System.out.println("Enter a Contact Number:");
			 contactNumber = scanner.next();
			if (contactNumber.matches("^[6789]\\d{9}$")) 
			{
				break;
			}else 
			{
				System.out.println("Please Enter a valid Contact Number");
			}
		}
		
		while(true) {
			System.out.println("Enter the Address:");
			address = scanner.next();
			if (address.matches("^[0-9a-zA-Z0-9]+$"))
			{
				break;
			}else
			{
				System.out.println("Please Enter the valid address");
			}
		}
		
		while(true){
			System.out.println("Enter the type of vehicle:");
			typeOfVehicle = scanner.next();
			if(typeOfVehicle.equalsIgnoreCase("TWO")) {
				break;
			}
			else if(typeOfVehicle.equalsIgnoreCase("FOUR")){
				break;
			}
			else {
				System.out.println("Enter a valid type");
			}
		}

		while(true) {
			System.out.println("Enter the age");
			age = scanner.nextInt();
			if(age>=18 && age<=80)
			{
				System.out.println("You are eligible for License Generate");
				break;
			}
			else
			{
				System.out.println("Your age is invalid for license");
			}
		}
		GenerateLicense generateLicense = new GenerateLicense( firstName, lastName, contactNumber, address, typeOfVehicle, age);
		GenerateLicenseDAO.addGenerateLicense(generateLicense);
	}

	@SuppressWarnings("resource")
	public static void addLicenseDetails() throws SQLException, ParseException {
		//LocalDate yearMonthDay = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("   Enter the user id : ");
		int userid = scanner.nextInt();
		String state="";
		
		
		while (true) {
            System.out.println("Enter the State");
            state = scanner.next();
            //scanner.close();

            if (state.matches("^[a-zA-Z]+$") &&
                    (state.equalsIgnoreCase("TAMILNADU") ||
                     state.equalsIgnoreCase("ANDHRAPRADESH") ||
                     state.equalsIgnoreCase("MADHYAPRADESH") ||
                     state.equalsIgnoreCase("KARNATAKA") ||
                     state.equalsIgnoreCase("KERALA"))) {
                state = state.toUpperCase();
                //GenerateLicenseDAO.generateLicense(state);
                break;
            } else {
                System.out.println("Please enter a valid state.");
            }
        }
		
//		while(true) {
//			
//			
//			System.out.println("Enter the License Issued Date");
//			issuedDate = scanner.next();
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//			try
//			
//			{
//			    yearMonthDay = LocalDate.parse(issuedDate, formatter);
//		
//			    break;
//			} catch (DateTimeParseException e)
//			{
//			    System.out.println("Please provide a valid Date Format (yyyy-MM-DD)");
//			}
//		}
//		
//		while(true) {
//			System.out.println("Enter the License Expired Date");
//			expiredDate = scanner.next();
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//			try
//			
//			{
//			    yearMonthDay = LocalDate.parse(expiredDate, formatter);
//		
//			    break;
//			} catch (DateTimeParseException e)
//			{
//			    System.out.println("Please provide a valid Date Format (yyyy-MM-DD)");
//			}
//		}
		Date issue=null;
		Date expired=null;
		   System.out.println("Enter date of issue (dd-MM-yyyy):");
		    String dateinput=scanner.next();
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
			
			try {
				issue=dateFormat.parse(dateinput);
			} catch (ParseException e) {
				// TODO: handle exception
		    System.out.println("Please provide a valid Date Format (yyyy-MM-DD)");

			e.printStackTrace();
			}
		
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Calendar c = Calendar.getInstance();
			c.setTime(issue); // Using today's date
			c.add(Calendar.DATE, 7306); // Adding 5 days
			String output = sdf.format(c.getTime());
			expired=sdf.parse(output);
				//.daydiff(dateOfIssue,dataOfReturn);
			String dateToissue = dateFormat.format(issue);
			String dateToexpired = dateFormat.format(expired);
		GenerateLicenseDAO.generateLicense(userid, state, dateToissue, dateToexpired);
	}
	
	@SuppressWarnings("resource")
	public static void updateLicenseDetails() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the User id : ");
		int userid = scanner.nextInt();
		
		
		System.out.println("Enter the new Firstname : ");
		String newfirstName = scanner.next();
		while(true) 
		{
			System.out.println("Enter a New First Name:");
			newfirstName = scanner.next();
			if (newfirstName.matches("^[a-zA-Z]+$")) 
			{
				break;
			}else
			{
				System.out.println("Please Enter a valid New First Name");
			}
		}
		
		
		System.out.println("Enter the new Lastname : ");
		String newlastName = scanner.next();
		
		while(true) 
		{
			System.out.println("Enter a Last Name:");
			newlastName = scanner.next();
			if (newlastName.matches("^[a-zA-Z]+$")) 
			{
				break;
			}else 
			{
				System.out.println("Please Enter a valid Last Name");
			}
		}
		
		
		System.out.println("Enter the new contact number");
		String newcontactNumber = scanner.next();
		
		while(true)
		{
			System.out.println("Enter a Contact Number:");
			 newcontactNumber = scanner.next();
			if (newcontactNumber.matches("^[6789]\\d{9}$")) 
			{
				break;
			}else 
			{
				System.out.println("Please Enter a valid Contact Number");
			}
		}
		
		
		System.out.println("Enter the new Address : ");
		String newAddress = scanner.next();
		
		while(true) {
			System.out.println("Enter the Address:");
			newAddress = scanner.next();
			if (newAddress.matches("^[0-9a-zA-Z0-9]+$"))
			{
				break;
			}else
			{
				System.out.println("Please Enter the valid address");
			}
		}
		
		GenerateLicenseDAO.updateDetails(userid, newfirstName, newlastName, newcontactNumber, newAddress);
	}
	
	public static void showDetails() throws SQLException {
		GenerateLicenseDAO.showDetails();
	}
	
	@SuppressWarnings("resource")
	public static void showParticularDetails() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your UserID:");
		int userID = scanner.nextInt();
		GenerateLicenseDAO.showParticularDetails(userID);
	}
	
	public static void checkLicenseRenewal() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please id");
		int user_id=scanner.nextInt();
		LicenseRenewalDAO.checkLicenseRenewal(user_id);
		
	}
	
	}

	


