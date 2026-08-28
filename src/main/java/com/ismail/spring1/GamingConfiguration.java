package com.ismail.spring1;

import com.ismail.spring1.game.GameRunner;
import com.ismail.spring1.game.GamingConsole;
import com.ismail.spring1.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        return new PacMan();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
