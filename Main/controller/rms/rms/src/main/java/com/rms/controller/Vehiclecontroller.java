package com.rms.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import com.rms.entity.VehicleDetails;
import com.rms.service.VehicleService;


import java.util.*;

@Controller
public class Vehiclecontroller {
	
	@Autowired
	private  VehicleService vehicleservice ;
	
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/vehicleregister")
	public String vehicleregister() {
		return "NewVehicleCreate";
	}
	
	@GetMapping("/getvehicledetails")
	public ModelAndView getAllSupplier() {
		List<VehicleDetails> listvehicle=vehicleservice.getAllVehicle();
        return new ModelAndView("VehicleList","vehicle",listvehicle);
	}
	
	
	@PostMapping("/createvehicle")
	public String addVehicle(@ModelAttribute VehicleDetails vehicleDetails) {
	    vehicleservice.addVehicle(vehicleDetails);
	    return "redirect:/getvehicledetails";
	}
	
	/*@RequestMapping(method=RequestMethod.POST,value="/createsupplier")
	public void addSupplier(@RequestBody SupplierDetails supplierDetails)
	{
		supplierservice.addSupplier(supplierDetails);
	}*/


	
	@RequestMapping("/editvehicle/{id}")
	public String editVehicle(@PathVariable("id") int id,Model model) {
		VehicleDetails v =vehicleservice.getVehicleDetailsById(id);
		model.addAttribute("vehicle",v);
		return "VehicleEdit";
		}
	
	

    @RequestMapping("/deletevehicle/{id}")
	public String deleteVehicle(@PathVariable("id")int id) {
		vehicleservice.deleteById(id);
		return "redirect:/getvehicledetails";
	}
	
	

}
