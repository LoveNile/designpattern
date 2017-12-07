package com.nile.design.factory;

import com.nile.design.factory.abstractfactory.PizzaIngredientFactory;
import com.nile.design.factory.abstractfactory.impl.NyPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("NY")) {
            return new NYStyleCheesePizza(new NyPizzaIngredientFactory());
        }
        return null;
    }
}
