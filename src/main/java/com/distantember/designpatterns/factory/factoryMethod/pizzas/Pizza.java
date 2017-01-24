package com.distantember.designpatterns.factory.factoryMethod.pizzas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jondann on 1/16/17.
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("preparing " + name);
        System.out.println("tossing dough");
        System.out.println("adding sauce");
        System.out.println("adding toppings");
        for (String topping : toppings){
            System.out.println("   " + topping);
        }
    }

    public void bake(){
        System.out.println("baking for 25 minutes");
    }

    public void cut(){
        System.out.println("cutting into diagonal slices");
    }

    public void box(){
        System.out.println("boxing");
    }

    public String getName(){
        return name;
    }
}
