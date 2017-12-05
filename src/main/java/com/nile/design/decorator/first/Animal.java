package com.nile.design.decorator.first;

/**
 * 根据java的多态，达到类型匹配，通过使装饰者和被装饰者有相同的”接口“，使装饰者替代被装饰者。
 * 利用组合的方式向被装饰者添加行为，从而替代被装饰者。
 * 可以是接口也可以是抽象类，根据实际情况考虑
 */
public interface Animal {
    public String describe();
}
