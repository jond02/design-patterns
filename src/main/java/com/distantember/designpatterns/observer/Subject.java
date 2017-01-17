package com.distantember.designpatterns.observer;

/**
 * Created by jondann on 1/16/17.
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
