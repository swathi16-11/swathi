package com.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rms.entity.Adminlogin;
import com.rms.repository.AdminloginRepository;





@Controller

public class AdminloginController {

	 

	@Autowired

	private AdminloginRepository adminrepo;

	
	
	@GetMapping("/")

    public String adminlogin() {

        return "Admin";

    }


    @GetMapping("/logout")

    public String adminlogout() {

        return "Admin";

    }

    
    

//   

    @PostMapping("/admin")

	public String saveadmin(Adminlogin admin) {

    	

    	adminrepo.save(admin);



		return "redirect:/adminlogin";	

	}

//    @PostMapping("/admin")

//    public String login(@PathVariable("username") String username, @RequestParam("password") String password, RedirectAttributes redirectAttributes) {

//

//        Adminlogin user = adminrepo.findByUserName(username);

//        System.out.println(user);

//        if (user != null && user.getPassword().equals(password)) {

//            return "adminview";   

//        }

//        else {

//            // Password does not match or user does not exist, redirect back to login page with an error message

//            redirectAttributes.addFlashAttribute("error", "Invalid username or password");

//            return "redirect:/adminlogin"; // Redirect back to the login page

//        }

//    }

//

//    

//

//    

//    @PostMapping("/adminlog")

//    public String login(@PathVariable("username") String username, @RequestParam("password") String password, RedirectAttributes redirectAttributes) {

//

//        Adminlogin user = adminrepo.findByUsername(username);

//        System.out.println(user);

//        if (user != null && user.getPassword().equals(password)) {

//            return "adminview";   

//        }

//        else {

//            // Password does not match or user does not exist, redirect back to login page with an error message

//            redirectAttributes.addFlashAttribute("error", "Invalid username or password");

//            return "redirect:/adminlogin"; // Redirect back to the login page

//        }

//    }

    @GetMapping("/adminlog")

    public String  adminlogger()

    {

		return "index"; 

    	

    }

//    @PostMapping("/adminlog") 

//    public String adminlogin(@RequestParam("username") String username, @RequestParam("password") String password, RedirectAttributes redirectAttributes) {

//

//        Adminlogin user = adminrepo.findByUsername(username);

//        System.out.println(user);

//        if (user != null && user.getPassword().equals(password)) {

//            return "adminview";   

//        }

//        else {

//            // Password does not match or user does not exist, redirect back to login page with an error message

//            redirectAttributes.addFlashAttribute("error", "Invalid username or password");

//            return "redirect:/adminlogin"; // Redirect back to the login page

//        }

//    }

    @PostMapping("/adminlog")

  	public String login(Adminlogin admin, RedirectAttributes redirectAttributes) {



  	   Adminlogin user = adminrepo.getById(admin.getId());

  	    System.out.println(user);

  	    if (user != null && user.getPassword().equals(admin.getPassword())) {

  	    	return "index";   

  	    }

  	    else {

  	    	

  	        // Password does not match or user does not exist, redirect back to login page with an error message

  	        redirectAttributes.addFlashAttribute("error", "Invalid username or password");

  	        return "redirect:/adminlogin"; // Redirect back to the login page

  	    }

  	}



}

