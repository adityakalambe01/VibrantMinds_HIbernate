package com.day01.dao;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class DbConnection {
    public static Session session = new Configuration().configure("day01/hibernate.cfg.xml")
            .buildSessionFactory()
            .openSession();
}
