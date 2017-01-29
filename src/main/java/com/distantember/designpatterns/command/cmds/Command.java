package com.distantember.designpatterns.command.cmds;

/**
 * Created by jondann on 1/24/17.
 */
public interface Command {

    void execute();
    void undo();
}
