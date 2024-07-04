package com.dao;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class DbConnection {
    public static Session session = new Configuration().configure()
            .buildSessionFactory()
            .openSession();
}
