package com.nile.design.decorator.first.impl;

import com.nile.design.decorator.first.Animal;

public class Flower implements Animal {

    private Animal animal;

    public Flower(Animal animal) {
        this.animal = animal;
    }

    public String describe() {
        return this.animal.describe() + "戴了一朵小花";
    }
}
