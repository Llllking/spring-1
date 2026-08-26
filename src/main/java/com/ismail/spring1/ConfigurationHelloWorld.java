package com.ismail.spring1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationHelloWorld {
    @Bean
    public String name(){
        return "ismail";
    }
}
