package com.rms.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.rms.entity.LicenseDetails;

public interface LicenseRepository extends JpaRepository<LicenseDetails, Integer>{
		
		}