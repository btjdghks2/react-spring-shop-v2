package com.example.shopspring.EntityList.Product.product;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class ProductItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String mainimageUrl;

    @Column
    private String ContentimageUrl;

    @Column
    private int price;



    @OneToMany
    @JoinColumn(name = "productEntity_id")
    private List<ProductEntity> productEntity;



}
