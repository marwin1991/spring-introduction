package com.codecool.springdependencyinjection;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void test(){
        //given:
        ProductService productService = new ProductService(new ProductDiscountApplier(), new ProductRepository());
        BigDecimal priceBeforeDiscount = productService.getProductBeforeDiscount(1).getPrice();

        //when:
        Product productAfterDiscount = productService.getProductAfterDiscount(1);

        //then:
        assertTrue(productAfterDiscount.getPrice().compareTo(priceBeforeDiscount) < 0);
    }
}