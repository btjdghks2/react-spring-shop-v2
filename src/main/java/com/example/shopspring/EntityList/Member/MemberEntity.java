package com.example.shopspring.EntityList.Member;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MemberId;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String adress;
}
