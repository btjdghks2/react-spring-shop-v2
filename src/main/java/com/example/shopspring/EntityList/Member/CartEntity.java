package com.example.shopspring.EntityList.Member;

import com.example.shopspring.EntityList.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CartEntity extends BaseEntity {

    @Id
    @Column(name="cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private MemberEntity member;




}
