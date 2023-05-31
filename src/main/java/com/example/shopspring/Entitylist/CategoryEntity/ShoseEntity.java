package com.example.shopspring.Entitylist.CategoryEntity;

import javax.persistence.*;

@Entity
public class ShoseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Pnumber;

    @Column
    private String ShoseName;

    @Column
    private String ShoseContent;

    @Column
    private int Amount;
}
