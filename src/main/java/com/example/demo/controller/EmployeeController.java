package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * controller class
 *
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
@RestController
@RequestMapping( "/api" )
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping( "/employee" )
    public List<Employee> get()
    {
        return employeeService.get();
    }

    @GetMapping( "/employee/{id}" ) // id is a path variable
    public Employee get( @PathVariable Integer id )
    {
        return employeeService.get( id );
    }

    @PostMapping( "/employee" )
    public Employee save( @RequestBody Employee employee )
    {
        employeeService.save( employee );
        return employee;
    }

    @PutMapping( "/employee" )
    public Employee update( @RequestBody Employee employee )
    {
        employeeService.save( employee );
        return employee;
    }

    @DeleteMapping( "/employee/{id}" ) // id is a path variable
    public String delete( @PathVariable Integer id )
    {
        employeeService.delete( id );
        return "Employee object has been removed with id" + id;
    }
}
