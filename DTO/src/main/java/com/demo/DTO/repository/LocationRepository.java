package com.demo.DTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.DTO.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{
    
}
