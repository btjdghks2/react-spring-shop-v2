package com.example.shopspring.Entitylist.CategoryEntity;

import javax.persistence.*;

@Entity
public class PantsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Pnumber;

    @Column
    private String PantsName;

    @Column
    private String PantsContent;

    @Column
    private int Amount;
}
