package com.ismail.spring1.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age){};

record Address(String firstLine, String city){};

@Configuration
public class ConfigurationHelloWorld {
    @Bean
    public String name(){
        return "ismail";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Brahim", 18);
    }

    @Bean
    public Address address(){
        return new Address("quartier Amal", "TitMellil");
    }
}
