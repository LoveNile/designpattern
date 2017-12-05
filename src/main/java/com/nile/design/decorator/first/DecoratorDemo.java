package com.nile.design.decorator.first;

import com.nile.design.decorator.first.impl.Cat;
import com.nile.design.decorator.first.impl.Dog;
import com.nile.design.decorator.first.impl.Flower;

public class DecoratorDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal animalDog = new Flower(dog);
        Animal animalCat = new Flower(cat);
        System.out.println(animalDog.describe());
        System.out.println(animalCat.describe());
    }
}
