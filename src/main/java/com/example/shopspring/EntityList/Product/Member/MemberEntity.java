package com.example.shopspring.EntityList.Product.Member;

import javax.persistence.*;
import java.util.List;

@Entity
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String memberId;

    @Column
    private String memberpassword;

    @JoinColumn(name = "member_item")
    @OneToMany
    private List<MemberItemEntity> memberItemEntityList;
}
