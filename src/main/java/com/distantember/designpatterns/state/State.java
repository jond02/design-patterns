package com.distantember.designpatterns.state;

/**
 * Created by jondann on 3/9/17.
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
