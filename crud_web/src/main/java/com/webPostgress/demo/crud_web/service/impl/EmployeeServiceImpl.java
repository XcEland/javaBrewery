package com.webPostgress.demo.crud_web.service.impl;

import org.springframework.stereotype.Service;

import com.webPostgress.demo.crud_web.dto.EmployeeDto;
import com.webPostgress.demo.crud_web.entity.Employee;
import com.webPostgress.demo.crud_web.exception.ResourceNotFoundException;
import com.webPostgress.demo.crud_web.mapper.EmployeeMapper;
import com.webPostgress.demo.crud_web.repository.EmployeeRepository;
import com.webPostgress.demo.crud_web.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
        .orElseThrow(()-> new ResourceNotFoundException("Employee does not exit  with given id: "+employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
    
}
