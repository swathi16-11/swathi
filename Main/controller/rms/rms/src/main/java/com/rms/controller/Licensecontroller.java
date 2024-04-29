package com.rms.controller;
 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



import com.rms.entity.LicenseDetails;
import com.rms.service.LicenseService;


import java.util.*;

@Controller
public class Licensecontroller {
	
	@Autowired
	private  LicenseService licenseservice ;
	
	
	
	@GetMapping("/licenseregister")
	public String supplierregister() {
		return "NewLicenseCreate";
	}
	
	@GetMapping("/getlicensedetails")
	public ModelAndView getAllLicense() {
		List<LicenseDetails> list =licenseservice.getAllLicense();
        return new ModelAndView("licenseList","license",list);
	}
	
	
	@PostMapping("/createlicense")
	public String addLicense(@ModelAttribute LicenseDetails licenseDetails) {
		
	    licenseservice.addLicense(licenseDetails);
	    return "redirect:/getlicensedetails";
	}
	
	/*@RequestMapping(method=RequestMethod.POST,value="/createsupplier")
	public void addSupplier(@RequestBody SupplierDetails supplierDetails)
	{
		supplierservice.addSupplier(supplierDetails);
	}*/


	
	@RequestMapping("/edit/{id}")
	public String editLicense(@PathVariable("id") int id,Model model) {
		LicenseDetails l = licenseservice.getLicenseDetailsById(id);
		model.addAttribute("license",l);
		return "LicenseEdit";
		}
	
	

    @RequestMapping("/delete/{id}")
	public String deleteLicense(@PathVariable("id")int id) {
		licenseservice.deleteById(id);
		return "redirect:/getlicensedetails";
	}
	

}
