package com.distantember.designpatterns.singleton;

/**
 * Created by jondann on 1/23/17.
 */
public class SingletonSync {

    private static SingletonSync singletonSync;

    private SingletonSync(){}

    //synchronized can reduce performance by 100x
    public static synchronized SingletonSync getInstance(){
        if (singletonSync == null){
            singletonSync = new SingletonSync();
        }
        return singletonSync;
    }

}
