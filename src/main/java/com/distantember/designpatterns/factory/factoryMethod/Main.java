package com.distantember.designpatterns.factory.factoryMethod;

import com.distantember.designpatterns.factory.factoryMethod.stores.ChicagoPizzaStore;
import com.distantember.designpatterns.factory.factoryMethod.stores.NYPizzaStore;
import com.distantember.designpatterns.factory.factoryMethod.stores.PizzaStore;

/**
 * Created by jondann on 1/16/17.
 */
public class Main {

    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
    }
}
