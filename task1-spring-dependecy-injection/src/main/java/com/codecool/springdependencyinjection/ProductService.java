package com.codecool.springdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ProductService {

    private final Product product = new Product(BigDecimal.valueOf(23.50));

    private final ProductDiscountApplier applier;

    @Autowired
    public ProductService(ProductDiscountApplier applier) {
        this.applier = applier;
    }

//    @Autowired
//    public void setApplier(ProductDiscountApplier applier) {
//        this.applier = applier;
//    }

    public Product getProductBeforeDiscount(){
        return product;
    }

    public Product getProductAfterDiscount(){
        return applier.applyDiscount(product);
    }
}
