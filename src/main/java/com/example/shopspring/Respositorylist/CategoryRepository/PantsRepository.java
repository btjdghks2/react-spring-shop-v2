package com.example.shopspring.Respositorylist.CategoryRepository;

import com.example.shopspring.Entitylist.CategoryEntity.PantsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PantsRepository extends JpaRepository<PantsEntity, Long> {
    @Override
    List<PantsEntity> findAll();
}
