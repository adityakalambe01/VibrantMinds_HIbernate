package com.day03;

import com.day03.model.Employee;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        Session session =DbUtils.sessionFactory.openSession();
        session.save(new Employee());
        session.beginTransaction().commit();
        System.out.println(session);
    }
}
