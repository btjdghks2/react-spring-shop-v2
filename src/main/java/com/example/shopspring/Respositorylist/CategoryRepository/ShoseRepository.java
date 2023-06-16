package com.example.shopspring.Respositorylist.CategoryRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShoseRepository extends JpaRepository<ShoseEntity, Long> {
    @Override
    List<ShoseEntity> findAll();
}
