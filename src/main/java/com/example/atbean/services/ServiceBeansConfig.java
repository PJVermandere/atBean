package com.example.atbean.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeansConfig {
    @Bean
    public KwadraatService kwadraat(){
        return new KwadraatService();
    }
}
