package com.day07.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "relationship_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String courseName;

    @ToString.Exclude
    @OneToMany(mappedBy = "course")
    private List<Student> courseList = new LinkedList<>();

    @ManyToMany
    @ToString.Exclude
    private List<Syllabus> syllabusList;
}
