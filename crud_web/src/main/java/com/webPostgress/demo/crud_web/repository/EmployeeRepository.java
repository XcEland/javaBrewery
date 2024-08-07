package com.webPostgress.demo.crud_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webPostgress.demo.crud_web.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
