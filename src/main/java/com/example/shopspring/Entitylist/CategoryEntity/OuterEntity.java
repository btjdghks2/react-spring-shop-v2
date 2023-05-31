package com.example.shopspring.Entitylist.CategoryEntity;

import javax.persistence.*;

@Entity
public class OuterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Pnumber;

    @Column
    private String OuterName;

    @Column
    private String OuterContent;

    @Column
    private int Amount;
}
