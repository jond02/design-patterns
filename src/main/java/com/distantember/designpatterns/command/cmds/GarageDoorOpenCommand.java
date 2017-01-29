package com.distantember.designpatterns.command.cmds;

import com.distantember.designpatterns.command.objs.GarageDoor;

/**
 * Created by jondann on 1/24/17.
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.up();
    }

    public void undo(){

    }
}
