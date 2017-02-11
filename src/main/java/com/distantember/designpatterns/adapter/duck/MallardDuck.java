package com.distantember.designpatterns.adapter.duck;

/**
 * Created by jondann on 2/11/17.
 */
public class MallardDuck implements Duck {

    public void quack(){
        System.out.println("Quack");
    }

    public void fly(){
        System.out.println("flying");
    }
}
