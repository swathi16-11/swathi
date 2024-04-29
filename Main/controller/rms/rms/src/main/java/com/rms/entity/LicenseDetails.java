package com.rms.entity;





import jakarta.persistence.*;


	@Entity
	@Table(name="license")
	public class LicenseDetails{


		@Override
		public String toString() {
			return "LicenseDetails [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address
					+ ", licensenumber=" + licensenumber + ", state=" + state + ", issuedate=" + issuedate
					+ ", expirydate=" + expirydate + "]";
		}



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



		public String getLicensenumber() {
			return licensenumber;
		}



		public void setLicensenumber(String licensenumber) {
			this.licensenumber = licensenumber;
		}



		public String getState() {
			return state;
		}



		public void setState(String state) {
			this.state = state;
		}



		public String getIssuedate() {
			return issuedate;
		}



		public void setIssuedate(String issuedate) {
			this.issuedate = issuedate;
		}



		public String getExpirydate() {
			return expirydate;
		}



		public void setExpirydate(String expirydate) {
			this.expirydate = expirydate;
		}



		@Id
		private int id;
	    private String name;
	    private String contact;
	    private String address;
	    
	    private String licensenumber;
	    
	    private String state;
	    private String issuedate;
	   
	    private String expirydate;
	    


	    // Constructor
	    public LicenseDetails() {
	    	super();
	    	
	    }



		public LicenseDetails(int id, String name, String contact, String address, String licensenumber, String state,
				String issuedate, String expirydate) {
			super();
			this.id = id;
			this.name = name;
			this.contact = contact;
			this.address = address;
			this.licensenumber = licensenumber;
			this.state = state;
			this.issuedate = issuedate;
			this.expirydate = expirydate;
		}



		
	    
	    
}