package com.example.shopspring.EntityList.Product.List;

import com.example.shopspring.EntityList.Product.Member.MemberEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class RepleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    @JoinColumn(name = "member_id")
    @OneToMany
    private List<MemberEntity> memberEntity;
}
