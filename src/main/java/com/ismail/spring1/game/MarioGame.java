package com.ismail.spring1.game;

public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("go into the hole");
    }
    public void right(){
        System.out.println("accelerate");
    }
    public void left(){
        System.out.println("go backwards");
    }
}
