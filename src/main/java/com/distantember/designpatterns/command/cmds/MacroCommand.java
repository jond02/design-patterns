package com.distantember.designpatterns.command.cmds;

/**
 * Created by jondann on 1/29/17.
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    public void execute(){
        for (int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    public void undo(){
        for (int i = commands.length - 1; i >= 0; i--){
            commands[i].undo();
        }
    }

}
