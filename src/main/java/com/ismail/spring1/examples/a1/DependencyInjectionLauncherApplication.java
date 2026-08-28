package com.ismail.spring1.examples.a1;

import com.ismail.spring1.game.GameRunner;
import com.ismail.spring1.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass{

    private Dependency1 dependency1;
    private Dependency2 dependency2;
    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }

    public String toString(){
        return new StringBuilder("using ").append(dependency1).append(" and ").append(dependency2).toString();
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}



@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }

}
