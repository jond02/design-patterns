package com.distantember.designpatterns.command.cmds;

import com.distantember.designpatterns.command.objs.Light;

/**
 * Created by jondann on 1/29/17.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }

    public void undo(){
        light.on();
    }
}
