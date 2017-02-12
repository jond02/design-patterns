package com.distantember.designpatterns.template;

/**
 * Created by jondann on 2/11/17.
 */
public class Tea extends CaffeineBeverage {

    public void brew(){
        System.out.println("steeping the tea");
    }

    public void addCondiments(){
        System.out.println("adding lemon");
    }
}
