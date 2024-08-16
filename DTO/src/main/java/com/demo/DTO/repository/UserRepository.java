package com.demo.DTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.DTO.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
