package com.ismail.spring1;

import com.ismail.spring1.game.GameRunner;
import com.ismail.spring1.game.PacMan;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var game = new PacMan(); //1.Object creation
        var gameRunner = new GameRunner(game);//2.Objet creation + wiring of dependencies  game is a dependency of gameRunner
        gameRunner.run();

    }

}
