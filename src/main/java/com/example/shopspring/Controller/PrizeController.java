package com.example.shopspring.Controller;

import com.example.shopspring.Service.PrizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PrizeController {

    private final PrizeService prizeService;

    @GetMapping("/")
    public ResponseEntity<?> home() {
        return new ResponseEntity<>(prizeService.);
    }


}
