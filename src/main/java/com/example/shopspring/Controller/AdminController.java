package com.example.shopspring.Controller;

import com.example.shopspring.Entitylist.CategoryEntity.OuterEntity;
import com.example.shopspring.Service.AdminService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdminController {

    private AdminService adminService;

    @PostMapping("/admin/post")
    public ResponseEntity<?> Outersave(@RequestBody OuterEntity outerEntity) throws IllegalAccessException {
        return new ResponseEntity<>(adminService.Outersave(outerEntity), HttpStatus.OK);
    }





}
