package com.nile.design.factory;

import com.nile.design.factory.abstractfactory.PizzaIngredientFactory;
import com.nile.design.factory.abstractfactory.impl.NyPizzaIngredientFactory;

public class TestFactoryPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("NY");
    }
}
