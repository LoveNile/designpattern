package com.nile.design.Command.impl;

import com.nile.design.Command.Command;
import com.nile.design.Command.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        if (light != null) {
            this.light = light;
        } else {
            throw new NullPointerException();
        }

    }

    @Override
    public void execute() {
        light.off();
    }
}
