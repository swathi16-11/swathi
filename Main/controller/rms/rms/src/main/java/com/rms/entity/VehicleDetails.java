package com.rms.entity;




import jakarta.persistence.*;

	@Entity
	@Table(name="vehicle")
	public class VehicleDetails{
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getVehiclenumber() {
			return vehiclenumber;
		}

		public void setVehiclenumber(String vehiclenumber) {
			this.vehiclenumber = vehiclenumber;
		}

		public String getVehiclecategory() {
			return vehiclecategory;
		}

		public void setVehiclecategory(String vehiclecategory) {
			this.vehiclecategory = vehiclecategory;
		}

		public String getMaker() {
			return maker;
		}

		public void setMaker(String maker) {
			this.maker = maker;
		}

		public String getManufacturingdate() {
			return manufacturingdate;
		}

		public void setManufacturingdate(String manufacturingdate) {
			this.manufacturingdate = manufacturingdate;
		}

		@Id
		private int id;
	    private String name;
	    private String contact;
	    private String address;
	    private String vehiclenumber;
	    private String vehiclecategory;
	    private String maker;
	    
	    private String manufacturingdate;
	   
	    // Constructor
	    public VehicleDetails() {
	    	super();
	    	
	    }

		public VehicleDetails(int id, String name, String contact, String address, String vehiclenumber,
				String vehiclecategory, String maker, String manufacturingdate) {
			super();
			this.id = id;
			this.name = name;
			this.contact = contact;
			this.address = address;
			this.vehiclenumber = vehiclenumber;
			this.vehiclecategory = vehiclecategory;
			this.maker = maker;
			this.manufacturingdate = manufacturingdate;
		}
	    
	    

	
	}
		