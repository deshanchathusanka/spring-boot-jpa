package com.example.demo.dao;

import com.example.demo.model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * JPA Repository
 *
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
@Repository
public class EmployeeDAOImpl implements EmployeeDAO
{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> get()
    {
        Session session = entityManager.unwrap( Session.class );
        Query<Employee> employeeQuery = session.createQuery( "from Employee", Employee.class );
        return employeeQuery.getResultList();
    }

    @Override
    public Employee get( int id )
    {
        return null;
    }

    @Override
    public void save( Employee employee )
    {

    }

    @Override
    public void delete( Employee employee )
    {

    }
}