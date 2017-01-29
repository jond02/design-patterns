package com.distantember.designpatterns.command;

import com.distantember.designpatterns.command.cmds.*;
import com.distantember.designpatterns.command.objs.GarageDoor;
import com.distantember.designpatterns.command.objs.Light;
import com.distantember.designpatterns.command.objs.Stereo;

/**
 * Created by jondann on 1/29/17.
 */
public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        //if Command had one method with a matching signature then lambdas could be used
        //lambdas can replace functional interfaces - interfaces with one method
            //remoteControl.setCommand(0, () -> { livingRoomLight.on(); }, () -> {livingRoomLight.off(); } );
        //or a method reference
            //remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(0, livingLightOn, livingLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(3, stereoOn, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);

    }

}
