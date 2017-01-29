package com.distantember.designpatterns.command.cmds;

import com.distantember.designpatterns.command.objs.GarageDoor;

/**
 * Created by jondann on 1/29/17.
 */
public class GarageDoorCloseCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.down();
    }

    public void undo(){

    }
}
