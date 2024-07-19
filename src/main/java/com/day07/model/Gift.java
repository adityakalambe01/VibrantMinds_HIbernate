package com.day07.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "relationship_gift")
public class Gift {
    @Id
    @GeneratedValue
    private int giftId;

    private String giftName;

    private String giftCategory;

/*    @ManyToOne
    private Student studentId;*/

}
