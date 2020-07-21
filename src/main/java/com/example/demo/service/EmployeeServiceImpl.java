package com.example.demo.service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService
{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    @Override
    public List<Employee> get()
    {
        return employeeDAO.get();
    }

    @Transactional
    @Override
    public Employee get( int id )
    {
        return employeeDAO.get( id );
    }

    @Transactional
    @Override
    public void save( Employee employee )
    {
        employeeDAO.save( employee );
    }

    @Transactional
    @Override
    public void delete( Employee employee )
    {

    }
}
