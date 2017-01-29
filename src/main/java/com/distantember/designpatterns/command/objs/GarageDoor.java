package com.distantember.designpatterns.command.objs;

/**
 * Created by jondann on 1/24/17.
 */
public class GarageDoor {

    private String name;

    public GarageDoor(String name){
        this.name = name;
    }

    public GarageDoor(){
        name = "Garage Door";
    }

    public void up(){
        System.out.println("up");
    }

    public void down(){
        System.out.println("down");
    }

    public void stop(){
        System.out.println("stop");
    }

    public void lightOn(){
        System.out.println("light on");
    }

    public void lightOff(){
        System.out.println("light off");
    }

    public String getName() {
        return name;
    }
}
