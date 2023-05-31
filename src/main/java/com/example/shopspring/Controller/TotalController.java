package com.example.shopspring.Controller;


import com.example.shopspring.Service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TotalController {


    private TotalService totalService;

    @GetMapping("/outer")
    public ResponseEntity<?> OuterList() {
        return new ResponseEntity<>(totalService.OuterIndexLogic(), HttpStatus.OK);
    }

}
