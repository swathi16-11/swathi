package com.rto.example.RtoManagement;

//import java.time.YearMonth;

public class VehicleDetails {

	private String vehicleCategory;
	private String makersClass;
	private String  manufacturingDate;
	private String fuelUsed;
	
	
	
	public VehicleDetails(){
		super();
	}
	public VehicleDetails(String vehicleCategory, String makersClass, String manufacturingDate, String fuelUsed) {
		super();
		this.vehicleCategory = vehicleCategory;
		this.makersClass = makersClass;
		this.manufacturingDate = manufacturingDate;
		this.fuelUsed = fuelUsed;
	}
	public String getVehicleCategory() {
		return vehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	public String getMakersClass() {
		return makersClass;
	}
	public void setMakersClass(String makersClass) {
		this.makersClass = makersClass;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public String getFuelUsed() {
		return fuelUsed;
	}
	public void setFuelUsed(String fuelUsed) {
		this.fuelUsed = fuelUsed;
	}

}
