package com.example.shopspring.EntityList.Member;


import com.example.shopspring.EntityList.Product.ProductEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
public class OrderDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;

    private int count;
}
