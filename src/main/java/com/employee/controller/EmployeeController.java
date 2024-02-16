package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/s")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/insert")
    public Employee addemp(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getemployee/{id}")
    public Employee getemployee(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/getallemp")
    public List<Employee> getallEmployee()
    {
        return employeeService.getAllEmployeeDetails();
    }

    @PutMapping("/update")
    public Employee updatemp(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }


}
