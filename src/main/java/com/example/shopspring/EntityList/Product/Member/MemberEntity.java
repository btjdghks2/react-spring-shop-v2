package com.example.shopspring.EntityList.Product.Member;

import com.example.shopspring.EntityList.Product.List.OrderEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String ShoppingmalId;

    @Column
    private String membername;

    @Column
    private String memberpassword;

    @JoinColumn(name = "member_item")
    @OneToMany
    private List<MemberItemEntity> memberItemEntityList;


}
