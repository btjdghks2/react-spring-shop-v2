package com.example.shopspring.Dto;

import lombok.Data;



@Data
public class MemberDto {

    private Long Id;
    private String username;
    private String password;
    private String email;
    private String age;
    private String role;

}
