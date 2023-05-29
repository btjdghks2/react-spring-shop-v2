package com.example.shopspring.Entitylist;

import javax.persistence.*;

@Entity
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Membernumber;

    @Column
    private String Memberid;

    @Column
    private String Memberpasswd;

    @Column
    private int Memberphone;

    @Column
    private String adress;
}
