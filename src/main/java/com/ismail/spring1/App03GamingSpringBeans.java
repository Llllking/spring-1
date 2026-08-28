package com.ismail.spring1;

import com.ismail.spring1.game.GameRunner;
import com.ismail.spring1.game.GamingConsole;
import com.ismail.spring1.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }

}
