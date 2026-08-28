package com.ismail.spring1.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("marioGame")
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
