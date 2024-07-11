package com.day05;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CriteriaMain {
    private static Session session = DBUtils.sessionFactory.openSession();
    public static void addStudents(Session session){

        for (int x = 0; x < 100; x++) {

            StringBuffer studentName = new StringBuffer();
            StringBuffer collegeName = new StringBuffer();

            for (int i = 0; i < 8; i++) {
                studentName.append((char)(new Random().nextInt(26)+65));
            }

            for (int i = 0; i < 16; i++) {
                collegeName.append((char)(new Random().nextInt(26)+65));
            }

            Student student = new Student();
            student.setStudentName(studentName.toString());
            student.setCollegeName(collegeName.toString());
            student.setStudentPercentage(new Random().nextDouble()*100);
            session.save(student);
            session.beginTransaction().commit();

        }
    }

    //
    public static void displayAllStudents(Session session){
        List<Student> allStudents= session.createCriteria(Student.class).list();

        for (Student student : allStudents){
            System.out.println(student);
        }

    }

    //
    public static void displayStudentBySid(Session session, int sid){
        System.out.println(
                session.createCriteria(Student.class)
                        .add(Restrictions.eq("studentId", sid)).uniqueResult()
        );
    }

    //3
    public static void displayStudentByIdAndName(Session session, int id, String name){
        System.out.println(
                session.createCriteria(Student.class)
                        .add(Restrictions.and(
                                Restrictions.eq("studentId",id)
                        ).add(Restrictions.eq("studentName",name))
                        ).uniqueResult()
        );
    }

    //5
    public static void displayAllStudentPercentageLT(Session session, double percentage){
        session.createCriteria(Student.class)
                .add(Restrictions.lt("studentPercentage",percentage))
                .list()
                .forEach(System.out::println);
    }

    //6
    public static void percentageNotLessThan(Session session, double percentage){
        session.createCriteria(Student.class)
                .add(
                        Restrictions.not(
                            Restrictions.lt("studentPercentage",percentage)
                        )
                )
                .list()
                .forEach(System.out::println);
    }

    //7
    public static void studentsByIdBetween(Session session, int start, int end){
        session.createCriteria(Student.class)
                .add(
                        Restrictions.between("studentId", start, end)
                ).list()
                .forEach(System.out::println);
    }

    //8
    public static void  studentByIdIn(Session session, List<Integer> id){
        session.createCriteria(Student.class)
                .add(
                        Restrictions.in("studentId", id)
                ).list()
                .forEach(System.out::println);
    }

    //9
    public static void nameContains(Session session, String name){
        session.createCriteria(Student.class)
                .add(
                        Restrictions.like("studentName", "%"+name+"%")
                ).list()
                .forEach(System.out::println);
    }

    //10
    public static void orderByName(Session session){
        session.createCriteria(Student.class)
                .addOrder(
                        Order.asc("studentName")
                ).list()
                .forEach(System.out::println);
    }
    public static void main(String[] args) {

//        addStudents(session);
//        displayAllStudents(session);


//        displayStudentBySid(session,10);

//        displayStudentByIdAndName(session, 5, "IMAUUIPG");


//        displayAllStudentPercentageLT(session, 30.0);
//        percentageNotLessThan(session, 30.0);

//        studentsByIdBetween(session, 0,10);

//        List<Integer> list = Arrays.asList(10,58,96,56);
//        studentByIdIn(session, list);

//        nameContains(session, "XSCBISQW");

        orderByName(session);
    }
}
