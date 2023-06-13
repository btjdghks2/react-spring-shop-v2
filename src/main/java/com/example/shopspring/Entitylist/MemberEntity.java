package com.example.shopspring.Entitylist;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String age;

    @Column
    private String role;


}
