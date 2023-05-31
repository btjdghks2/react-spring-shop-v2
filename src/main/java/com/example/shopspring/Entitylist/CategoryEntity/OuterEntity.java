package com.example.shopspring.Entitylist.CategoryEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Entity
public class OuterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Pnumber;

    @Column
    private String OuterName;

    @Column
    private String OuterContent;

    @Column
    private int Amount;
}
