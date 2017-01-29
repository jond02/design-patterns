package com.distantember.designpatterns.command;

import com.distantember.designpatterns.command.cmds.Command;
import com.distantember.designpatterns.command.cmds.NoCommand;

/**
 * Created by jondann on 1/29/17.
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    private final int slots = 7;

    public RemoteControl(){

        onCommands = new Command[slots];
        offCommands = new Command[slots];

        Command noCommand = new NoCommand();
        for (int i = 0; i < slots; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    public String toString(){

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- Remote Control -----\n");
        for (int i = 0; i < slots; i++){
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName()
            + "    " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuffer.toString();
    }

}
