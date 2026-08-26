package com.ismail.spring1;

import com.ismail.spring1.game.GameRunner;
import com.ismail.spring1.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }

}
