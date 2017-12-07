package com.nile.design.factory.abstractfactory.impl;

import com.nile.design.factory.abstractfactory.Dough;
import com.nile.design.factory.abstractfactory.PizzaIngredientFactory;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough getDough() {
        return new ThinCrustDough();
    }
}
