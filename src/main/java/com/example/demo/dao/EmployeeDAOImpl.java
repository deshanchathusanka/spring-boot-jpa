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
        Session session = entityManager.unwrap( Session.class );
        return session.get( Employee.class, id );
    }

    @Override
    public void save( Employee employee )
    {
        Session session = entityManager.unwrap( Session.class );
        session.save( employee );
    }

    @Override
    public void delete( int id )
    {
        Session session = entityManager.unwrap( Session.class );
        Employee employee = session.get( Employee.class, id ); // retrieve employee object
        session.delete( employee );
    }
}
