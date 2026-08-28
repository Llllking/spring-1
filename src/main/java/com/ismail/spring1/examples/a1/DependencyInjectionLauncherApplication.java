package com.ismail.spring1.examples.a1;

import com.ismail.spring1.game.GameRunner;
import com.ismail.spring1.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){

        }
    }

}
