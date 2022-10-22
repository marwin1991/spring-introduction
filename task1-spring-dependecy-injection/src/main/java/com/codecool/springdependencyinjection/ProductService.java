package com.codecool.springdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductService {

    private final ProductDiscountApplier applier;
    private final ProductRepository repository;

    @Autowired
    public ProductService(ProductDiscountApplier applier, ProductRepository repository) {
        this.applier = applier;
        this.repository = repository;
    }

//    @Autowired
//    public void setApplier(ProductDiscountApplier applier) {
//        this.applier = applier;
//    }

    public Product getProductBeforeDiscount(long id){
        return repository.getProduct(id);
    }

    public Product getProductAfterDiscount(long id){
        return applier.applyDiscount(getProductBeforeDiscount(id));
    }
}
