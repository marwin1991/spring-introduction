package com.codecool.springdependencyinjection;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> products = Arrays.asList(
            new Product(BigDecimal.valueOf(23.50)),
            new Product(BigDecimal.valueOf(23.50))
    );

    public Product getProduct(long id){
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Cannot find product with id: " + id));
    }

}
