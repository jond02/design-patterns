package com.distantember.designpatterns.command.simple;

import com.distantember.designpatterns.command.cmds.GarageDoorOpenCommand;
import com.distantember.designpatterns.command.cmds.LightOnCommand;
import com.distantember.designpatterns.command.objs.GarageDoor;
import com.distantember.designpatterns.command.objs.Light;

/**
 * Created by jondann on 1/24/17.
 */
public class RemoteControlTest {

    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

    }
}
