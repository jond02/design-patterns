package com.distantember.designpatterns.factory.simpleFactory;

/**
 * Created by jondann on 1/16/17.
 */
public abstract class Pizza {

    public void prepare(){
        System.out.println("preparing");
    }

    public void bake(){
        System.out.println("baking");
    }

    public void cut(){
        System.out.println("cutting");
    }

    public void box(){
        System.out.println("boxing");
    }
}
