package com.example.shopspring.EntityList.Member;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CartEntity  {

    @Id
    @Column(name="cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private MemberEntity member;




}
