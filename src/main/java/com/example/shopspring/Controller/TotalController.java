package com.example.shopspring.Controller;


import com.example.shopspring.Service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TotalController {


    private TotalService totalService;


    //여기는 기본 상품들 목록으로 표시 하는 역할
    @GetMapping("/outer/")
    public ResponseEntity<?> OuterList() {
        return new ResponseEntity<>(totalService.OuterIndexLogic(), HttpStatus.OK);
    }

    @GetMapping("/pants/")
    public ResponseEntity<?> PantsList() {
        return new ResponseEntity<>(totalService.PantsIndexLogic(), HttpStatus.OK);
    }

    @GetMapping("/shose/")
    public ResponseEntity<?> ShoseList() {
        return new ResponseEntity<>(totalService.ShoseIndexLogic(),HttpStatus.OK);

    }
    @GetMapping("/tshirt/")
    public ResponseEntity<?> TshirtList() {
        return new ResponseEntity<>(totalService.TshirtIndexLogic(),HttpStatus.OK);
    }

    //여기서부턴 카테고리별 디테일 페이지

    @GetMapping("/outer/detail/{Pnumber}")
    public ResponseEntity<?> OuterDetail(@PathVariable Long Pnumber) {
        return new ResponseEntity<>(totalService.OuterDetailLogic(Pnumber), HttpStatus.OK);

    }
    @GetMapping("/pants/detail/{Pnumber}")
    public ResponseEntity<?> PantsDetail(@PathVariable Long Pnumber) {
        return new ResponseEntity<>(totalService.PantsDetailLogic(Pnumber), HttpStatus.OK);

    }
    @GetMapping("/shose/detail/{Pnumber}")
    public ResponseEntity<?> ShoseDetail(@PathVariable Long Pnumber) {
        return new ResponseEntity<>(totalService.ShoseDetailLogic(Pnumber), HttpStatus.OK);

    }
    @GetMapping("/tshirt/detail/{Pnumber}")
    public ResponseEntity<?> TshirtDetail(@PathVariable Long Pnumber) {
        return new ResponseEntity<>(totalService.TshirtDetailLogic(Pnumber), HttpStatus.OK);

    }



}
