package com.webPostgress.demo.crud_web.service;

import com.webPostgress.demo.crud_web.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);
}
