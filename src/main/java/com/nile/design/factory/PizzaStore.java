package com.nile.design.factory;

import com.nile.design.factory.abstractfactory.PizzaIngredientFactory;

/**
 * 工厂模式，推迟实例化到子类，子类处理对象的创建，并将创建的行为封装到子类中，这样超类的代码就和子类
 * 独享创建代码解耦
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
