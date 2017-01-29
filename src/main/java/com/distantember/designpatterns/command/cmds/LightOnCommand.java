package com.distantember.designpatterns.command.cmds;

import com.distantember.designpatterns.command.objs.Light;

/**
 * Created by jondann on 1/24/17.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }

    public void undo(){
        light.off();
    }

}
