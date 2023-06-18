package com.example.shopspring.EntityList;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class BaseEntity extends BaseTimeEntity{

    @CreatedBy
    @Column(updatable = false)
    private String createBy;

    @LastModifiedBy
    private String modifiedBy;
}
