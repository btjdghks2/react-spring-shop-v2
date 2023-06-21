package com.example.shopspring.EntityList.Product.Member;

import javax.persistence.*;

@Entity
public class MemberItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String address;

    @Column
    private String phonenumber;


}
