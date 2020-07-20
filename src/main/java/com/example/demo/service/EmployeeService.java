package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

/**
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
public interface EmployeeService
{
    /**
     * retrieve all employees
     * @return employees
     */
    List<Employee> get();

    /**
     * retrieve requested employee
     * @param id employee id
     * @return employee object
     */
    Employee get( int id );

    /**
     * save employee
     * @param employee
     */
    void save( Employee employee );

    /**
     * delete employee
     * @param employee
     */
    void delete( Employee employee );
}
