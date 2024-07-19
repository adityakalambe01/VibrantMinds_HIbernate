package com.day07;

import com.day07.model.Gift;
import com.day07.model.Laptop;
import com.day07.model.Student;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Random;

public class CRUDOperations {
    private Session session = new Configuration()
            .setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver")
            .setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/vmt_hibernate")
            .setProperty("hibernate.connection.username", "root")
            .setProperty("hibernate.connection.password", "root")
            .setProperty("hibernate.hbm2ddl.auto","update")
            .setProperty("hibernate.show_sql", "true")
            .setProperty("hibernate.format_sql", "true")
            .setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect")
            .setProperty("hibernate.connection.autocommit","true")
            .addAnnotatedClass(Student.class)
            .addAnnotatedClass(Laptop.class)
            .addAnnotatedClass(Gift.class)
            .buildSessionFactory()
            .openSession();


    private long getMobileNumber(){
        long min = 100000000;
        long max = 999999999;
        return min + (long) (Math.random() * (max - min));
    }


    private void addStudent(){
        String[] nameArray = new String[]{
                "Aditya", "Sanket", "Hitesh", "Akshay", "Abhay",
                "Khushbu", "Mohini", "Prajakta", "Alex", "Vaibhav"
        };
        Arrays.stream(nameArray)
                .forEach(
                        name -> {
                            Student student = new Student();
                            student.setStudentName(name);
                            student.setMobileNumber(getMobileNumber());
                            student.setEmail(
                                    name.toLowerCase()
                                            +new Random().nextInt(nameArray.length)
                                            +"@gmail.com"
                            );
                            session.save(student);
                            session.close();
                        }

                );
    }

    private void addLaptop(){
        String[] laptopNameArray = new String[]{
                "Dell", "Lenovo", "Asus", "Mac Book", "Acer",
                "HP", "Razer", "MSI", "RedMagic", "Mi"
        };

        Arrays.stream(laptopNameArray)
                .forEach(
                        name ->{
                            Laptop laptop = new Laptop();
                            laptop.setLaptopName(name);
                            laptop.setLaptopPrice(16000.0 + Math.random()*(75000.0-16000.0));
                            session.save(laptop);
                            session.close();
                        }
                );
    }

    private void addGift(){

    }

    public void addData(){
        if (session.createQuery("from Student ").list().isEmpty()){
            addStudent();
        }
        if (session.createQuery("from Laptop").list().isEmpty()){
            addLaptop();
        }
    }

    public void oneToOneRelation(){

    }




}
