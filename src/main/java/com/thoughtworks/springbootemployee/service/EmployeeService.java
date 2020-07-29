package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee findEmployeeById(int id);
    Page<Employee> getAllEmployee(Pageable pageable);
    void deleteEmployee(int id);
}
