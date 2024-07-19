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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String studentName;

    private long mobileNumber;

    private String email;

    @OneToOne
    @ToString.Exclude
    private Laptop laptop;

/*    @ManyToOne
    private List<Gift> giftList = new LinkedList<>();*/
}
