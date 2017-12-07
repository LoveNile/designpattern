package com.nile.design.factory;

import com.nile.design.factory.abstractfactory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
    private PizzaIngredientFactory factory;
    public NYStyleCheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        dough = factory.getDough().describe();
    }
}
