package com.codecool.springdependencyinjection;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void test(){
        //given:
        ProductService productService = new ProductService(new ProductDiscountApplier());
        BigDecimal priceBeforeDiscount = productService.getProductBeforeDiscount().getPrice();

        //when:
        Product productAfterDiscount = productService.getProductAfterDiscount();

        //then:
        assertTrue(productAfterDiscount.getPrice().compareTo(priceBeforeDiscount) < 0);
    }
}