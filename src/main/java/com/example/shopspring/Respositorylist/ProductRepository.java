package com.example.shopspring.Respositorylist;

import com.example.shopspring.EntityList.Product.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Override
    List<ProductEntity> findAll();
}
