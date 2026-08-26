package com.ismail.spring1;

import com.ismail.spring1.game.GameRunner;
import com.ismail.spring1.game.MarioGame;
import com.ismail.spring1.game.PacMan;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }

}
