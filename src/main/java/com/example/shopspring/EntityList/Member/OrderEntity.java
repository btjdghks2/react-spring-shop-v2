package com.example.shopspring.EntityList.Member;


import com.example.shopspring.EntityList.Product.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity extends ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn
    @ManyToOne
    private ProductNumber productNumber;
}
