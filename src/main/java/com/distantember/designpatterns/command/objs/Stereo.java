package com.distantember.designpatterns.command.objs;

/**
 * Created by jondann on 1/29/17.
 */
public class Stereo {

    private String name;

    public Stereo(String name){
        this.name = name;
    }

    public Stereo(){
        name = "Stereo";
    }

    public void on(){
        System.out.println("Turning stereo on");
    }

    public void off(){
        System.out.println("Turing stereo off");
    }

    public void setCD(){
        System.out.println("Setting the cd to James Taylor");
    }

    public void setVolume(int volume){
        System.out.println("Setting volume to " + volume);
    }

    public String getName() {
        return name;
    }

}
