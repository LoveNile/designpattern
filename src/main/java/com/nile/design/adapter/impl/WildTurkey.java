package com.nile.design.adapter.impl;

import com.nile.design.adapter.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("fly a short distance");
    }
}
