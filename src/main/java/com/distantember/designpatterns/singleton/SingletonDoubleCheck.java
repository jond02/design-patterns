package com.distantember.designpatterns.singleton;

/**
 * Created by jondann on 1/23/17.
 */
public class SingletonDoubleCheck {

    //volatile ensures that multiple threads handle the variable correctly when it is being initialized

    private volatile static SingletonDoubleCheck singletonDoubleCheck;

    private SingletonDoubleCheck(){}

    //synchronized performance hit is only on the first time through

    public static SingletonDoubleCheck getInstance(){

        if (singletonDoubleCheck == null){

            synchronized (SingletonDoubleCheck.class){
                if (singletonDoubleCheck == null){
                    singletonDoubleCheck = new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleCheck;
    }

}
