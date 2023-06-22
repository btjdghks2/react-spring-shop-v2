package com.example.shopspring.Service;


import com.example.shopspring.EntityList.Product.product.ProductEntity;
import com.example.shopspring.Respositorylist.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AdminProductService {

    private final ProductRepository productRepository;

    public ProductEntity adminproductsave(ProductEntity productEntity) {

        return productRepository.save(productEntity);

    }

    @Transactional
    public ProductEntity adminproductdelect(Long id) {
        return productRepository.delete(id);

    }

    public ProductEntity adminproductupdate(Long id,ProductEntity productEntity) {
        ProductEntity productentity = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("상품을 확인해주세요"));
        productentity.setProductName(productentity.getProductName());
        productentity.setProductContent(productentity.getProductContent());
        productentity.setAmount(productentity.getAmount());

        return null;
    }
}
