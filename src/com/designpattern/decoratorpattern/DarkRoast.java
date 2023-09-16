package com.designpattern.decoratorpattern;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        desc = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
