package com.distantember.designpatterns.template;

/**
 * Created by jondann on 2/11/17.
 */
public class Coffee extends CaffeineBeverage {

    public void brew(){
        System.out.println("dripping coffee through filter");
    }

    public void addCondiments(){
        System.out.println("adding sugar and milk");
    }
}
