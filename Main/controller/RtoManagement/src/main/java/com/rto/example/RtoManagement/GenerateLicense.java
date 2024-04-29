package com.rto.example.RtoManagement;

public class GenerateLicense {
	private String firstName;
	private String lastName;
	private String  contactNumber;
	private String address;
	private String typeOfVehicle;
	private int age;
	private String licenseNumber;

	
	public GenerateLicense() {
		super();
	}



	public GenerateLicense(String firstName, String lastName, String contactNumber, String address,
			String typeOfVehicle, int age,String licenseNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.typeOfVehicle = typeOfVehicle;
		this.age = age;
		this.licenseNumber=licenseNumber;
	}

	public GenerateLicense(String firstName2, String lastName2, String contactNumber2, String address2,
			String typeOfVehicle2, int age2) {
		super();
		this.firstName = firstName2;
		this.lastName = lastName2;
		this.contactNumber = contactNumber2;
		this.address = address2;
		this.typeOfVehicle = typeOfVehicle2;
		this.age = age2;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
}
