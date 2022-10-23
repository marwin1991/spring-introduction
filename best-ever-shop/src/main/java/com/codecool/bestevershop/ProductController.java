package com.codecool.bestevershop;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(("/products"))
public class ProductController {

    @GetMapping
    public List<Product> getAll(){
        return Collections.singletonList(new Product(1));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Product product){

    }

    @PutMapping("/{id}")
    public Product update(@PathVariable long id, @RequestBody Product product){
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){

    }
}
