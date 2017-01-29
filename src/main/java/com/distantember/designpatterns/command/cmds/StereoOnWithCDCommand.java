package com.distantember.designpatterns.command.cmds;

import com.distantember.designpatterns.command.objs.Stereo;

/**
 * Created by jondann on 1/29/17.
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo(){
        stereo.off();
    }
}
