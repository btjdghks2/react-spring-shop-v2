package com.example.shopspring.Respositorylist.CategoryRepository;

import com.example.shopspring.Entitylist.CategoryEntity.OuterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OuterRepository extends JpaRepository<Long, OuterEntity> {
}
