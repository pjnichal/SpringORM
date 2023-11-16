package org.example.dao;

import org.example.entites.Employee;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDao {
    private HibernateTemplate hibernateTemplate;
    public int insert(Employee employee){
        this.hibernateTemplate.save(employee);
        return  1;
    }

}
