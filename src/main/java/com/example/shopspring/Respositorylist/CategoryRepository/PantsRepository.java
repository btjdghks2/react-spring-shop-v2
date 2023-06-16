package com.example.shopspring.Respositorylist.CategoryRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PantsRepository extends JpaRepository<PantsEntity, Long> {
    @Override
    List<PantsEntity> findAll();
}
