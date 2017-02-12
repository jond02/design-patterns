package com.distantember.designpatterns.adapter.duck;

/**
 * Created by jondann on 2/11/17.
 */
public class DuckTestDrive {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck duck2 = new TurkeyAdapter(turkey);

        System.out.println("the duck says");
        duck.quack();
        duck.fly();

        System.out.println("the turkey says");
        turkey.gobble();
        turkey.fly();

        System.out.println("the turkey adapter says");
        duck2.quack();
        duck2.fly();

    }

}
