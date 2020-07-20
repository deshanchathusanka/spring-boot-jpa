package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller class
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
@RestController
@RequestMapping("/api")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> get()
    {
        return employeeService.get();
    }
}
