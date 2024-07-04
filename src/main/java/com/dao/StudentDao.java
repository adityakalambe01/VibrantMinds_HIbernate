package com.dao;

import com.model.Student;
import org.hibernate.Transaction;

public class StudentDao {
    public int insertStudent(Student student){
        int check = 0;
        Transaction transaction = DbConnection.session.beginTransaction();
        check = (int) DbConnection.session.save(student);
        transaction.commit();

        return check;
    }
}
