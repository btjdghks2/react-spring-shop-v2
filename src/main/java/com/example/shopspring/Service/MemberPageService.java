package com.example.shopspring.Service;

import com.example.shopspring.EntityList.Product.product.ProductEntity;
import com.example.shopspring.Respositorylist.OrderRepository;
import com.example.shopspring.Respositorylist.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberPageService {


    private final OrderRepository orderRepository;


}
