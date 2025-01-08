package com.gaur.springboot.service;

import com.gaur.springboot.exception.ResourceNotFoundException;
import com.gaur.springboot.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Employee createEmployee(Employee employee);

    public ResponseEntity<Employee> getEmployeeById(long id);

    public ResponseEntity<Employee> updateEmployee(long id, Employee employeeDetails);

    public ResponseEntity<HttpStatus> deleteEmployee( long id);
}
