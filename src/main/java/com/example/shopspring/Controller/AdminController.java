package com.example.shopspring.Controller;

import com.example.shopspring.Entitylist.CategoryEntity.OuterEntity;
import com.example.shopspring.Entitylist.CategoryEntity.PantsEntity;
import com.example.shopspring.Entitylist.CategoryEntity.ShoseEntity;
import com.example.shopspring.Entitylist.CategoryEntity.TshirtEntity;
import com.example.shopspring.Service.AdminService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AdminController {

    private AdminService adminService;

    @PostMapping("/admin/outerpost")
    public ResponseEntity<?> Outersave(@RequestBody OuterEntity outerEntity) throws IllegalAccessException {
        return new ResponseEntity<>(adminService.Outersave(outerEntity), HttpStatus.OK);
    }

    @PostMapping("/admin/pantspost")
    public ResponseEntity<?> Pantsave(@RequestBody PantsEntity pantsEntity) throws IllegalAccessException {
        return new ResponseEntity<>(adminService.Pantsave(pantsEntity), HttpStatus.OK);
    }
    @PostMapping("/admin/shosepost")
    public ResponseEntity<?> Shosesave(@RequestBody ShoseEntity shoseEntity) throws IllegalAccessException {
        return new ResponseEntity<>(adminService.Shosesave(shoseEntity), HttpStatus.OK);
    }
    @PostMapping("/admin/tshirtpost")
    public ResponseEntity<?> Tshirtsave(@RequestBody TshirtEntity tshirtEntity) throws IllegalAccessException {
        return new ResponseEntity<>(adminService.Tshirtsave(tshirtEntity), HttpStatus.OK);
    }

    //삭제
    @DeleteMapping("/admin/outer/detail/{pnumber}/delete/")
    public ResponseEntity<?> outerdelete(@PathVariable Long pnumber, @RequestBody OuterEntity outerEntity) {
        return new ResponseEntity<>(adminService.outerdelete(pnumber), HttpStatus.OK);
    }

    @DeleteMapping("/admin/pants/detail/{pnumber}/delete/")
    public ResponseEntity<?> pantsdelete(@PathVariable Long pnumber, @RequestBody PantsEntity pantsEntity) {
        return new ResponseEntity<>(adminService.pantsdelete(pnumber), HttpStatus.OK);
    }

    @DeleteMapping("/admin/shose/detail/{pnumber}/delete/")
    public ResponseEntity<?> shosedelete(@PathVariable Long pnumber, @RequestBody ShoseEntity shoseEntity) {
        return new ResponseEntity<>(adminService.shosedelete(pnumber), HttpStatus.OK);
    }

    @DeleteMapping("/admin/tshirt/detail/{pnumber}/delete/")
    public ResponseEntity<?> tshirtdelete(@PathVariable Long pnumber, @RequestBody TshirtEntity tshirtEntity) {
        return new ResponseEntity<>(adminService.tshirtdelete(pnumber), HttpStatus.OK);
    }

    // admin 디테일 페이지

    @GetMapping("/admin/outer/detail/{Pnumber}")
    public ResponseEntity<?> OuterDetail(@PathVariable Long Pnumber) {
        return new ResponseEntity<>(adminService.OuterDetail(Pnumber), HttpStatus.OK);

    }
    @GetMapping("/admin/pants/detail/{Pnumber}")
    public ResponseEntity<?> PantsDetail(@PathVariable Long Pnumber) {
        return new ResponseEntity<>(adminService.PantsDetail(Pnumber), HttpStatus.OK);

    }
    @GetMapping("/admin/shose/detail/{Pnumber}")
    public ResponseEntity<?> ShoseDetail(@PathVariable Long Pnumber) {
        return new ResponseEntity<>(adminService.ShoseDetail(Pnumber), HttpStatus.OK);

    }
    @GetMapping("/admin/tshirt/detail/{Pnumber}")
    public ResponseEntity<?> TshirtDetail(@PathVariable Long Pnumber) {
        return new ResponseEntity<>(adminService.TshirtDetail(Pnumber), HttpStatus.OK);

    }

    //목록 페이지

    @GetMapping("/admin/outer/")
    public ResponseEntity<?> OuterList() {
        return new ResponseEntity<>(adminService.OuterIndex(), HttpStatus.OK);
    }

    @GetMapping("/admin/pants/")
    public ResponseEntity<?> PantsList() {
        return new ResponseEntity<>(adminService.PantsIndex(), HttpStatus.OK);
    }

    @GetMapping("/admin/shose/")
    public ResponseEntity<?> ShoseList() {
        return new ResponseEntity<>(adminService.ShoseIndex(),HttpStatus.OK);

    }
    @GetMapping("/admin/tshirt/")
    public ResponseEntity<?> TshirtList() {
        return new ResponseEntity<>(adminService.TshirtIndex(),HttpStatus.OK);
    }





}
