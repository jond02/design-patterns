package com.distantember.designpatterns.adapter.duck;

/**
 * Created by jondann on 2/11/17.
 */
public class WildTurkey implements Turkey {

    public void gobble(){
        System.out.println("gobble");
    }

    public void fly(){
        System.out.println("hovering");
    }
}
