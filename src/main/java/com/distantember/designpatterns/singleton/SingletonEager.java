package com.distantember.designpatterns.singleton;

/**
 * Created by jondann on 1/23/17.
 */
public class SingletonEager {

    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return singletonEager;
    }
}
