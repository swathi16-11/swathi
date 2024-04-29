package com.rms.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.entity.VehicleDetails;
import com.rms.entity.LicenseDetails;
import com.rms.repository.VehicleRepository;
import com.rms.repository.LicenseRepository;

@Service
public class LicenseService {
	
	   @Autowired
		private LicenseRepository lrepo;
		//add
	   public void addLicense(LicenseDetails licensedetails) {
		    
		    Random rand = new Random();
		    int randomNumber = rand.nextInt(100);
		    
		    String state = licensedetails.getState();
		    if (state.equalsIgnoreCase("TamilNadu")) {
		    	state = "TN";
		    	licensedetails.setLicensenumber(state.substring(0, 2) + 2024 + randomNumber);
		    } else {
		        // Handle the case where state is null...
		    	licensedetails.setLicensenumber(state.substring(0, 2) + 2024 + randomNumber);
		    	
		    }
		    
		    lrepo.save(licensedetails);
		}

		//view
		public List<LicenseDetails> getAllLicense(){
			return lrepo.findAll();
		}
		
		//update
		public LicenseDetails getLicenseDetailsById(int id) {
			
			return lrepo.findById(id).get();
		}
		//delete
		
		public void deleteById(int id) {
			
			lrepo.deleteById(id);
		}


		

		 
		 

		
	}



