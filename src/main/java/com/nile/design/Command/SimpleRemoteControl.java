package com.nile.design.Command;

public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }
    public void buttonWasPressed() {
        slot.execute();
    }

}
