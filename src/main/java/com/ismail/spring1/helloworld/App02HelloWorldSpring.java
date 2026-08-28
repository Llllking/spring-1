package com.ismail.spring1.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1 : create spring context
        var context =
                new AnnotationConfigApplicationContext(ConfigurationHelloWorld.class);
        //2 : configure the things that we want spring to manage using a configuration class ConfigurationHelloWorld
        //3 : retrieving beans managed by spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));

    }

}
