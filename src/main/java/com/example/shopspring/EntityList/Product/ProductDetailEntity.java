package com.example.shopspring.EntityList.Product;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String imgname;

    @Column
    private String imgUrl;


}
