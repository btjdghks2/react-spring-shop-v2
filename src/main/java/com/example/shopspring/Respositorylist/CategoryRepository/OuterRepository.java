package com.example.shopspring.Respositorylist.CategoryRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OuterRepository extends JpaRepository<OuterEntity, Long> {

    @Override
    List<OuterEntity> findAll();


}
