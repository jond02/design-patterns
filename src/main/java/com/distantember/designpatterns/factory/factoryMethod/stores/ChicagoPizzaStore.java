package com.distantember.designpatterns.factory.factoryMethod.stores;


import com.distantember.designpatterns.factory.factoryMethod.pizzas.*;

/**
 * Created by jondann on 1/16/17.
 */
public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type){
        if (type.equals("cheese")){
            return new ChicagoCheesePizza();
        } else if (type.equals("pepperoni")){
            return new ChicagoPepperoniPizza();
        } else if (type.equals("clam")){
            return new ChicagoClamPizza();
        } else if (type.equals("veggie")){
            return new ChicagoVeggiePizza();
        } else {
            return null;
        }
    }

}
