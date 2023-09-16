package com.designpattern.decoratorpattern;

public class Soy extends CondimentDecorator{
    private final Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.99;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " + Soy";
    }
}
