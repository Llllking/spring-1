package com.ismail.spring1.exercices.e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CalculationAppContextLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(CalculationAppContextLauncherApplication.class)){
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }

}
