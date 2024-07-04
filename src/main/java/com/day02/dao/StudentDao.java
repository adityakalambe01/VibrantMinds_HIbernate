package com.day02.dao;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class StudentDao {
    Session session = new Configuration().configure("day02/hibernate.cfg.xml").buildSessionFactory().openSession();

}
