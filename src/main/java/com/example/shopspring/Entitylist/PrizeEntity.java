package com.example.shopspring.Entitylist;

import javax.persistence.*;

@Entity
public class PrizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PId;

    @Column
    private String title;
    @Column
    private String content;

    @Column
    private int pnumber;




}
