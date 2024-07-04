package com;


import com.dao.StudentDao;
import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {

//        Configuration configuration = new org.hibernate.cfg.Configuration().configure();
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();

        Student student = new Student();
        student.setName("Aditya");
        student.setCity("Pune");
        student.setPercentage(98.88);
//        System.out.println(session.save(student));
//
//        transaction.commit();
//        session.close();

        StudentDao studentDao = new StudentDao();
        System.out.println(
                studentDao.insertStudent(student)
        );
    }
}
