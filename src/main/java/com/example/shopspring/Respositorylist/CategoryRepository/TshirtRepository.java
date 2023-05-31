package com.example.shopspring.Respositorylist.CategoryRepository;

import com.example.shopspring.Entitylist.CategoryEntity.TshirtEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TshirtRepository extends JpaRepository<TshirtEntity, Long> {
    @Override
    List<TshirtEntity> findAll();
}
