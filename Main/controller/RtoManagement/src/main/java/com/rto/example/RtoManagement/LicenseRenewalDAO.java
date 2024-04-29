package com.rto.example.RtoManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LicenseRenewalDAO {

public static void checkLicenseRenewal(int user_id) throws SQLException 
{

String query="SELECT DATEDIFF(expirydate, CURRENT_DATE()) FROM generatelicense where user_id=?";
	Connection con=DBConnection.getConnection();	
PreparedStatement pst=con.prepareStatement(query);

pst.setInt(1,user_id);
ResultSet rSet=pst.executeQuery();
long st=0;
while (rSet.next()) {
	st=rSet.getLong(1);
	break;
}

if(st>=0) {
	System.out.println("No need to renew");
	return;
}
else if(st<0 && st>=-30){
	//fine = 10
	System.out.println("You have not return the book so your fine amount is 1000RS");
}
else if(st<-30 && st>=-60) {
	//fine = 30
	System.out.println("You have not return the book so your fine amount is 5000RS");

}
else {
	//fine = 100
	System.out.println("You have not return the book so your fine amount is 10000RS");

}
}

}
