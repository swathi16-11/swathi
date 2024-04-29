package com.rto.example.RtoManagement;

public class LicenseDetails {
	private String state;
	private String newlicenseNumber;
	private String issuedDate;
	private String expiredDate;
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	public String getNewlicenseNumber() {
		return newlicenseNumber;
	}
	public void setNewlicenseNumber(String newlicenseNumber) {
		this.newlicenseNumber = newlicenseNumber;
	}
	
	public String getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}
	public String getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	public LicenseDetails() {
		super();
	}
	
	public LicenseDetails(String state,String newlicenseNumber, String issuedDate, String expiredDate) {
		this.state=state;
		this.newlicenseNumber=newlicenseNumber;
		this.issuedDate = issuedDate;
		this.expiredDate = expiredDate;
	}
}
