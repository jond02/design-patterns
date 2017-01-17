package com.distantember.designpatterns.strategy;

/**
 * Created by jondann on 1/15/17.
 */
public class Quack implements QuackBehavior {

    public void quack(){
        System.out.println("I'm quaking");
    }
}
