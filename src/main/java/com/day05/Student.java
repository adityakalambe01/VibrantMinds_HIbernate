package com.day05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "day_05_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int studentId;

    @Column(name = "name")
    private String studentName;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "percentage")
    private double studentPercentage;
}
