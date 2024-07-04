package com.day01;


import com.day01.dao.StudentDao;
import com.day01.model.Student;

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
