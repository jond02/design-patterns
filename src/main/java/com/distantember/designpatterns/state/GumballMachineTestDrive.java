package com.distantember.designpatterns.state;

/**
 * Created by jondann on 3/10/17.
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
