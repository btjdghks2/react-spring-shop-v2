package com.example.shopspring.Respositorylist;

import com.example.shopspring.Entitylist.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Long, MemberEntity> {
}
