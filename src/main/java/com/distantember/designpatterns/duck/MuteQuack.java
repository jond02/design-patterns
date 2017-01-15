package com.distantember.designpatterns.duck;

/**
 * Created by jondann on 1/15/17.
 */
public class MuteQuack implements QuackBehavior {

    public void quack(){
        System.out.println("Silence");
    }
}
