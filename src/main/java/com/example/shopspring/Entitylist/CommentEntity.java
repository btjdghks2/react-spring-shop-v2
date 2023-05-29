package com.example.shopspring.Entitylist;

import javax.persistence.*;

@Entity
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CommentId;

    @Column
    private String CommentContent;




}
