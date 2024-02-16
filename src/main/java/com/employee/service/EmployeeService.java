package com.employee.service;

import com.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployeeDetails();

    Employee getEmployeeById(int id);

    Employee updateEmployee(Employee employee);

    Employee addEmployee(Employee employee);

    void deleteEmployee(int id);

}
