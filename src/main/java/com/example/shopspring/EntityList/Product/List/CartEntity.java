package com.example.shopspring.EntityList.Product.List;

import com.example.shopspring.EntityList.Product.product.ProductEntity;
import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "product_id")
    private List<ProductEntity> productEntityList;
}
