package com.nile.design.factory.abstractfactory;

/**
 * 抽象工厂模式，提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
 * 缺点：当改变接口时，所有实现类都会更改
 * 可以添加多种原料（演示一种）
 */
public interface PizzaIngredientFactory {
    public Dough getDough();
}
