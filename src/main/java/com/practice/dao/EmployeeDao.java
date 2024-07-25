package com.practice.dao;

import com.practice.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {
    private SessionFactory sessionFactory = new Configuration()
                                            .configure("practice/hibernate.cfg.xml")
                                            .buildSessionFactory();

    public int insertEmployee(Employee emp) {
        int check = 0;
        Session session = sessionFactory.openSession();
        check = (int) session.save(emp);
        session.beginTransaction().commit();
        session.close();
        return check;
    }

    public Employee getEmployeeById(int id) {
        Session session = sessionFactory.openSession();
        Employee emp = session.get(Employee.class, id);
        session.close();
        return emp;
    }
}
