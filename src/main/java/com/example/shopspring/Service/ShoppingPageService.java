package com.example.shopspring.Service;



import com.example.shopspring.EntityList.Product.List.OrderEntity;
import com.example.shopspring.EntityList.Product.product.ProductEntity;
import com.example.shopspring.Respositorylist.OrderRepository;
import com.example.shopspring.Respositorylist.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShoppingPageService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;


    //홈 상품전체 조회
    public List<ProductEntity> homeindex() {
        return productRepository.findAll();
    }
    //카테고리 목록조회
    public List<ProductEntity> outercategory() {

        return productRepository.outercategory();
    }

    public List<ProductEntity> pantscategory() {

        return productRepository.pantscategory();
    }

    public List<ProductEntity> shosecategory() {

        return productRepository.shosecategory();
    }

    //상품 상세페이지 값 넘기기
    public ProductEntity itemDetail(Long id) {
        return productRepository.findById(id).orElseThrow(() ->new IllegalArgumentException("상품을 불러오는데 실패했습니다"));
    }

    //상품 구매시 상품의 재고 수량 -1 차감

    public ProductEntity itempayment(Long id,ProductEntity productEntity) {
        ProductEntity productentity = productRepository.findById(id).orElseThrow(() ->new IllegalArgumentException("상품을 불러오는데 실패했습니다"));
        productentity.amount = productEntity.amount - 1;

        //여기서 오더 목록에 현재 상품을 추가 해야 함



        return null;
    }

    //주문 목록 제작



}
