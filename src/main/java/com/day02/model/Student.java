package com.day02.model;

import javax.persistence.Table;

@Table(name = "adityakalalalal")
public class Student {
    private int studentId;
    private String studentName;
    private long mobileNumber;
    private double studentPercentage;

    public Student(int studentId, String studentName, long mobileNumber, double studentPercentage) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
        this.studentPercentage = studentPercentage;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getStudentPercentage() {
        return studentPercentage;
    }

    public void setStudentPercentage(double studentPercentage) {
        this.studentPercentage = studentPercentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", studentPercentage=" + studentPercentage +
                '}';
    }
}
