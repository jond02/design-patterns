package com.distantember.designpatterns.command.cmds;

/**
 * Created by jondann on 1/29/17.
 */
public class NoCommand implements Command {

    //a null object, use this instead of checking for null
    public void execute(){
    }

    public void undo(){}
}
