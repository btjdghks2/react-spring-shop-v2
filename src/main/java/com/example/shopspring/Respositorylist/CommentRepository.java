package com.example.shopspring.Respositorylist;

import com.example.shopspring.Entitylist.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Long, CommentEntity> {
}
