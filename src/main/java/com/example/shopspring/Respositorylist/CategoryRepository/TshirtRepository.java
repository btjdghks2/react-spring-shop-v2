package com.example.shopspring.Respositorylist.CategoryRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TshirtRepository extends JpaRepository<TshirtEntity, Long> {
    @Override
    List<TshirtEntity> findAll();
}
