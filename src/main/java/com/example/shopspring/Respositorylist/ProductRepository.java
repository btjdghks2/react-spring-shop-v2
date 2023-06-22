package com.example.shopspring.Respositorylist;

import com.example.shopspring.Dto.ProductDto;
import com.example.shopspring.EntityList.Product.product.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Override
    List<ProductEntity> findAll();

    @Query( value = "select id, productName " +
            "from product " +
            "where productnumber ==1")
    List<ProductEntity> outercategory();

    @Query( value = "select id, productName" +
            "from product" +
            "where productnumber ==2")
    List<ProductEntity> pantscategory();

    @Query( value = "select id, productName" +
            "from product" +
            "where productnumber ==3")
    List<ProductEntity> shosecategory();
}
