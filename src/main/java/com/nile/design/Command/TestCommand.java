package com.nile.design.Command;

import com.nile.design.Command.impl.LightOnCommand;

public class TestCommand {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}
