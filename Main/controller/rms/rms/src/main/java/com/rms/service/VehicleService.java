package com.rms.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.entity.VehicleDetails;
import com.rms.repository.VehicleRepository;

import jakarta.transaction.Transactional;



@Service
public class VehicleService {
	
	    @Autowired
		private VehicleRepository vrepo;
	    
	    @Transactional
		//add
		public void addVehicle(VehicleDetails vehicle) {
			vrepo.save(vehicle);
		}
		
		//view
		public List<VehicleDetails> getAllVehicle(){
			return vrepo.findAll();
		}
		
		//update
		public VehicleDetails getVehicleDetailsById(int id) {
			
			return vrepo.findById(id).get();
		}
		//delete
		
		public void deleteById(int id) {
			
			vrepo.deleteById(id);
		}

}
