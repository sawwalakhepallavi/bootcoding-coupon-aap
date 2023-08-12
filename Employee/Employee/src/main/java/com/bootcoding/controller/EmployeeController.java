package com.bootcoding.controller;

import com.bootcoding.model.Employee;
import com.bootcoding.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public void insertEmployee(@RequestBody Employee emp){
       employeeService.insertEmployee(emp);
    }
//    @GetMapping("/insertEmployee")
//    public List<Employee> insertEmployees(){
//
//        return employeeService.insertEmployee(10);
//    }

}
