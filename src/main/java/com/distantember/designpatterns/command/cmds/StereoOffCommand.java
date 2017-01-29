package com.distantember.designpatterns.command.cmds;

import com.distantember.designpatterns.command.objs.Stereo;

/**
 * Created by jondann on 1/29/17.
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.off();
    }

    public void undo(){

    }

}


