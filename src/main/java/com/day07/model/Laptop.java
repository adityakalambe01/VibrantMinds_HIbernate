package com.day07.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "relationship_laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int laptopId;

    private String laptopName;

    @Column(columnDefinition = "double(8,2) default 30000.36")
    private double laptopPrice;

    @OneToOne
    @ToString.Exclude
    private Student student;
}
