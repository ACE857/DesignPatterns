package com.designpattern.decoratorpattern;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        desc = "HouseBlend";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
