package com.designpattern.decoratorpattern;

public class Whip extends CondimentDecorator{
    private final Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.999;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " + Whip";
    }
}
