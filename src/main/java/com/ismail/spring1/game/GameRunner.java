package com.ismail.spring1.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;
    public GameRunner(@Qualifier("marioGame") GamingConsole game) {
        this.game = game;
    }
    public void run() {
        System.out.println("running : " + game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
