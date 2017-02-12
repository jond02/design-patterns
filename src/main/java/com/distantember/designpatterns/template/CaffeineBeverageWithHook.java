package com.distantember.designpatterns.template;

/**
 * Created by jondann on 2/11/17.
 */
public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("boiling water");
    }

    public void pourInCup(){
        System.out.println("pouring in cup");
    }

    public boolean customerWantsCondiments(){
        return true;
    }

}
