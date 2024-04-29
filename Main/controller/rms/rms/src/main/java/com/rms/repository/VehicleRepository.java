package com.rms.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.rms.entity.VehicleDetails;

public interface  VehicleRepository extends JpaRepository<VehicleDetails,Integer>{

}
