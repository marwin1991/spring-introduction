package com.codecool.springdependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class AlaMakota {

    @Bean
    public Gson configPrudct(){
        return new Gson();
    }
}
