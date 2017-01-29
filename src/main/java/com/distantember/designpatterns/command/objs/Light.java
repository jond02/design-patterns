package com.distantember.designpatterns.command.objs;

/**
 * Created by jondann on 1/24/17.
 */
public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public Light() {
        name = "Light";
    }

    public void on() {
        System.out.println("light is on");
    }

    public void off() {
        System.out.println("light is off");
    }

    public String getName() {
        return name;
    }
}
