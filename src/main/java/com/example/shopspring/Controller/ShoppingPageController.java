package com.example.shopspring.Controller;


import com.example.shopspring.EntityList.Product.product.ProductEntity;
import com.example.shopspring.Respositorylist.ProductRepository;
import com.example.shopspring.Service.ShoppingPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ShoppingPageController {

    private final ProductRepository productRepository;

    private final ShoppingPageService shoppingPageService;


    @GetMapping("/")
    public String Mainpage(Model model) {
        List<ProductEntity> productEntityList = productRepository.findAll();

        model.addAttribute("productindexlist",productEntityList);


        return "";
    }




}
