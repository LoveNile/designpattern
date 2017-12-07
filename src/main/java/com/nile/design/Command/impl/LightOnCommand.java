package com.nile.design.Command.impl;

import com.nile.design.Command.Command;
import com.nile.design.Command.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        if (light != null) {
            this.light = light;
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public void execute() {
        light.on();
    }
}
