package com.example.shopspring.Entitylist.CategoryEntity;

import javax.persistence.*;

@Entity
public class TshirtEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Pnumber;

    @Column
    private String TshirtName;

    @Column
    private String TshirtContent;

    @Column
    private int Amount;
}
