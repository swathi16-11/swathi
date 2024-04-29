package com.rto.example.RtoManagement;



import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import com.google.protobuf.Value.KindCase;

public  class Main{
	
	public static void main(String[] args) throws SQLException, ParseException {
//		String state = "";
//		String stateTwoLetters="";
//		String manufacturingDate="";
//		String contactNumber ="";
//		String licenseNumber="";
//		String firstName="";
//		String lastName="";
//		String address="";
//		String VehicleType="";
//		int age;
//		String licenseNum="";
//		String typeOfVehicle="";
	   try(Scanner scanner = new Scanner(System.in)){
		   
		while(true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~RTO Managing and Registering System~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\n                                                   Menu");
			System.out.println("\n   1.Register a Vehicle");
			System.out.println("\n   2. Show All Vehicle Details");
			System.out.println("\n   3.New License");
			System.out.println("\n   4.Add License Details");
			System.out.println("\n   5.Update License Details");
			System.out.println("\n   6.Show all User details");
			System.out.println("\n   7.Show Particular License Details");
			System.out.println("\n   8.License Renewal");
			System.out.println("\n   9.Exit");
			System.out.println("\n   Choose an option\n");
			int choice = scanner.nextInt();
			
			
			switch(choice) {
			case 1:
				Menu.addVehicleDetails();
				break;
			
			case 2:
				Menu.showVehicleDetails();
				break;
				
			case 3:
				
				Menu.addGenerateLicenses();
	            break;
	
				
			case 4:
				Menu.addLicenseDetails();
				break;
				
				
//		   case 4:
//			   LicenseDetails generateLicense = new LicenseDetails();
//			   System.out.println("licenseNum: "+ licenseNum );
//			   System.out.println("FirstName: "+firstName);
//				System.out.println("lastName: "+lastName);
//				System.out.println("VehicleType: "+typeOfVehicle);
//				while(true) {
//					   String issuedDate = scanner.next();
//						String expiredDate = scanner.next();
//				int calculateYear = Integer.parseInt(expiredDate.substring(0,4)) - Integer.parseInt(issuedDate.substring(0,4));
//				System.out.println("calculateYear: "+calculateYear);
//				int calculateMonthForObtainedMonth = calculateYear * 12;
//				System.out.println("calculateMonthForObtainedMonth: "+calculateMonthForObtainedMonth);
//				int calculateMonthForIssuedDate = 12-Integer.parseInt(issuedDate.substring(5,7))+1;
//				System.out.println("calculateMonthForObtainedMonth: " + calculateMonthForIssuedDate);
//				int calculateMonthForExpiredDate = 12-Integer.parseInt(expiredDate.substring(5,7));
//				System.out.println("calculateMonthForExpiredDate: " + calculateMonthForExpiredDate);
//				int calculateMonthForTotalMonth = calculateMonthForObtainedMonth - (calculateMonthForIssuedDate+calculateMonthForExpiredDate);
//
//				System.out.println("calculateMonthForTotalMonth: " + calculateMonthForTotalMonth);
//				if(calculateYear > 20) {
//					System.out.println("A Year have been passed, You need Renew Your License");
//					break;
//				}
//				else if(calculateMonthForTotalMonth > 240) {
//					System.out.println("Months have been Passed, You need to Renew Your License");
//					break;
//				}
//				else {
//					System.out.println("/n");
//				}
//				   }
//				  
//				break;
//				
		   case 5:
			   Menu.updateLicenseDetails();
			   break;
			   
		   case 6:
			   Menu.showDetails();
			   break;
			   
		   case 7:
			   Menu.showParticularDetails();
			   break;
		   case 8:
			   Menu.checkLicenseRenewal();
			   break;
		    }
			
			
				
			
				
				

			
			
			
			
		}
		
	   }
		
	}
}
	
	
	