package com.example.shopspring.EntityList.Product.product;


import com.example.shopspring.EntityList.Product.List.RepleEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    public int ProductNumber;

    @Column
    private String productName;

    @Column
    private String productContent;

    @Column
    public int amount;

    @JoinColumn(name = "reple_id")
    @OneToMany
    private List<RepleEntity> repleEntityList;
}
