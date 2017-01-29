package com.distantember.designpatterns.command.simple;

import com.distantember.designpatterns.command.cmds.Command;

/**
 * Created by jondann on 1/24/17.
 */
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
