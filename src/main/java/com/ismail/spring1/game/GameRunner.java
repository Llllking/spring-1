package com.ismail.spring1.game;

public class GameRunner {
    private MarioGame game;
    public GameRunner(MarioGame game) {
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
