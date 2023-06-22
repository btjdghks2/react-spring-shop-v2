package com.example.shopspring.Respositorylist;

import com.example.shopspring.EntityList.Product.List.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {

    @Override
    List<OrderEntity> findAll();
}
