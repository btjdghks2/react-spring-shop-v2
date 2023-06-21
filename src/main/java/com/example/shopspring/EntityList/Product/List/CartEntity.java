package com.example.shopspring.EntityList.Product.List;

import com.example.shopspring.EntityList.Product.product.ProductEntity;


import javax.persistence.*;
import java.util.List;

@Entity
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "product_id")
    private List<ProductEntity> productEntityList;
}
