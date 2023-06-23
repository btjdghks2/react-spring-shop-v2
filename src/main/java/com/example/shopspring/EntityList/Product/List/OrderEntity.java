package com.example.shopspring.EntityList.Product.List;

import com.example.shopspring.EntityList.Product.Member.MemberEntity;
import com.example.shopspring.EntityList.Product.product.ProductEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "product_id")
    @OneToMany
    private List<ProductEntity> productEntityList;


}
