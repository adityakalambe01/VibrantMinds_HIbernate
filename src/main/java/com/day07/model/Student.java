package com.day07.model;

import lombok.*;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "relationship_student")
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(name = "name")
    private String studentName;

    @Column(name = "ph_no")
    private long mobileNumber;

    @Column(name = "email")
    private String email;

    @OneToOne
    @ToString.Exclude
    private Laptop laptop;

    @ToString.Exclude
    @OneToMany(mappedBy="student")
    private List<Gift> giftList = new LinkedList<>();

    @ManyToOne
    @ToString.Exclude
    private Course course;
}
