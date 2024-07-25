package com.day07;

import com.day07.model.*;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.*;

public class CRUDOperations {
    private Session session = new Configuration()
            .setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver")
            .setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/vmt_hibernate")
            .setProperty("hibernate.connection.username", "root")
            .setProperty("hibernate.connection.password", "root")
            .setProperty("hibernate.hbm2ddl.auto","update")
            .setProperty("hibernate.show_sql", "false")
            .setProperty("hibernate.format_sql", "false")
            .setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect")
            .setProperty("hibernate.connection.autocommit","true")
            .addAnnotatedClass(Student.class)
            .addAnnotatedClass(Laptop.class)
            .addAnnotatedClass(Gift.class)
            .addAnnotatedClass(Course.class)
            .addAnnotatedClass(Syllabus.class)
            .buildSessionFactory()
            .openSession();


    private long getMobileNumber(){
        long min = 100000000;
        long max = 999999999;
        return min + (long) (Math.random() * (max - min));
    }

    public int getTotalStudents(){
        return session.createCriteria(Student.class).list().size();
    }

    public int getTotalLaptops(){
        return session.createCriteria(Laptop.class).list().size();
    }

    public int getTotalGifts(){
        return session.createCriteria(Gift.class).list().size();
    }

    public List<Student> getStudentList(){
        return session.createCriteria(Student.class).list();
    }

    public List<Laptop> getLaptopList(){
        return session.createCriteria(Laptop.class).list();
    }

    public List<Gift> getGiftList(){
        return session.createCriteria(Gift.class).list();
    }

    public List<Course> getCourseList(){
        return session.createCriteria(Course.class).list();
    }

    public List<Syllabus> getSyllabusList(){
        return session.createCriteria(Syllabus.class).list();
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
                        }
                );
    }

    private void addGift(){
        String[] giftNameArray = new String[]{
                "Bat", "Ball", "Neckless", "Bangles", "Pen",
                "Pencil", "Keyboard", "Mouse", "Laptop", "RTX 5090 Ti",
                "AC", "Smartphone", "Power Bank", "Earbuds", "Bag", "Bottle",
                "Books", "Mask", "Router", "Brain"
        };
        Arrays.stream(giftNameArray)
                .forEach(
                        name ->{
                            Gift gift = new Gift();
                            gift.setGiftName(name);
                            session.save(gift);
                            session.beginTransaction().commit();
                        }

                );
    }

    private void addCourse(){
        String type = "";
        for(String courseName : new String[]{"Java", "Python", "MySQL"}){
            Course course = new Course();
            course.setCourseName(courseName);
            session.save(course);
        }
    }

    public void addSyllabus(){
        String[] syllabusNameArray = new String[]{"Introduction", "Operators", "OOP", "String", "Array", "CRUD Operations"};
        Arrays.stream(syllabusNameArray)
                .forEach(
                        syllabusName ->{
                            Syllabus syllabus = new Syllabus();
                            syllabus.setName(syllabusName);
                            session.save(syllabus);
                        }
                );

    }

    public void addData(){
        if (session.createQuery("from Student ").list().isEmpty()){
            addStudent();
        }
        if (session.createCriteria(Laptop.class).list().isEmpty()){
            addLaptop();
        }
        if (session.createCriteria(Gift.class).list().isEmpty()){
            addGift();
        }
        if (session.createCriteria(Course.class).list().isEmpty()){
            addCourse();
        }
        if (session.createCriteria(Syllabus.class).list().isEmpty()){
            addSyllabus();
        }
    }

    public void oneToOneRelation(){
        List<Integer> randomLaptopId = new ArrayList<>();
        int studentSize = session.createQuery("from Student").list().size();
        while (studentSize!= randomLaptopId.size()){
            int randomId = new Random().nextInt(studentSize) + 1;
            if (!randomLaptopId.contains(randomId)){
                randomLaptopId.add(randomId);
            }
        }

        randomLaptopId.stream()
                .forEach(
                        i ->{
                            //loading data
                            Laptop laptop = session.load(Laptop.class,randomLaptopId.get(i-1));
                            Student student = session.load(Student.class,i);

                            //set data
                            student.setLaptop(laptop);
                            laptop.setStudent(student);

                            //commit data
                            session.beginTransaction().commit();
                        }
                );
    }

    public void showStudentLaptop(){
        List<Student> studentList = getStudentList();
        studentList.forEach(
                student -> {
                    System.out.printf(
                            "%-20s %-20s",
                            student.getStudentName(), student.getLaptop().getLaptopName()

                    );
                    System.out.println();
                }
        );
    }

    public void oneToManyRelation() {
        List<Integer> randomGiftIdToStudentId = new ArrayList<>();
        int studentSize = session.createQuery("from Student").list().size();
        while(studentSize!= randomGiftIdToStudentId.size()){
            int randomId = new Random().nextInt(studentSize) + 1;
            if (!randomGiftIdToStudentId.contains(randomId)){
                randomGiftIdToStudentId.add(randomId);
            }
        }
        while (randomGiftIdToStudentId.size() != 20){
            int randomId = new Random().nextInt(studentSize)+1;
            randomGiftIdToStudentId.add(randomId);
        }
//        System.out.println(randomGiftIdToStudentId);

        for (int i = 0; i < randomGiftIdToStudentId.size(); i++) {
            Student student = session.load(Student.class,randomGiftIdToStudentId.get(i));
            Gift gift = session.load(Gift.class, i+1);
            gift.setStudent(student);
            session.save(gift);
            session.beginTransaction().commit();
        }
    }



    public void test(){
        System.out.println(session);
    }

    public void formatPrintingData(String s1, String s2){
        System.out.printf("%-20s%-20s",s1,s2);
        System.out.println();
    }


    public void showStudentsGifts() {
        List<Student> studentList = getStudentList();
        studentList.forEach(
                studentData -> {
                    studentData.setGiftList(
                            session.createQuery(
                                    "from Gift where student="+studentData.getStudentId()
                            ).list()
                    );
                }
        );
        formatPrintingData("Student Name", "Gift");
        studentList.forEach(
                student -> {
                    System.out.printf("%-20s|",student.getStudentName());
                    student.getGiftList()
                            .forEach(
                                    gift -> {
                                        System.out.printf("%-20s",gift.getGiftName());
                                    }
                            );
                    System.out.println();
                }
        );


    }

    public void showGiftsOfStudents(){
        formatPrintingData("Gift Name","Student Name");
        getGiftList().forEach(
                gft ->
                    formatPrintingData(
                            gft.getGiftName(),
                            gft.getStudent().getStudentName()
                    )

        );
    }



    /*
    *
    * Many to One Relation
    *
    * */
    public void manyToOneRelation(){
        List<Student> studentList = getStudentList();
        studentList.forEach(
                student -> {
                    student.setCourse(
                            session.get(
                                    Course.class,
                                    (int)(1 + Math.random()*(4-1))
                            )
                    );
                    session.save(student);
                    session.beginTransaction().commit();
                }

        );
    }

    public void showStudentCourses(){
        List<Student> studentList = getStudentList();
        studentList.forEach(
                student -> {
                    System.out.format(
                            "ID: %02d, Name: %-10s, Mobile Number: %10d, Email ID: %-20s, Course: %-10s",
                            student.getStudentId(),
                            student.getStudentName(),
                            student.getMobileNumber(),
                            student.getEmail(),
                            student.getCourse().getCourseName()
                    );
                    System.out.println();
                }
        );
    }

    /*
    *
    * Many to Many Relation
    *
    * */
    public void manyToManyRelation(){

        List<Course> courseList = getCourseList();

        courseList.forEach(
                course -> {
                    if (course.getSyllabusList().isEmpty()){
                        course.setSyllabusList(getSyllabusList());
                        session.save(course);
                        session.beginTransaction().commit();
                    }
                }
        );
    }

    public void showCourseSyllabus(){
        List<Course> courseList = getCourseList();
        courseList.forEach(
                course -> {
                    System.out.println(course.getCourseName()+": ");

                    course.getSyllabusList().forEach(
                            syllabus -> {
                                System.out.println("\t"+ syllabus.getId() +". "+syllabus.getName());
                            }

                    );
                }
        );

    }



    {
        this.addData();
        this.oneToOneRelation();
        this.oneToManyRelation();
        this.manyToOneRelation();
        this.manyToManyRelation();
    }
}
