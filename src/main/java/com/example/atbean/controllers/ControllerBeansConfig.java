package com.example.atbean.controllers;

import com.example.atbean.services.KwadraatService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerBeansConfig {
    @Bean
    IndexController index(KwadraatService service){
        return  new IndexController(service);
    }
}
