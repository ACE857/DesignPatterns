package com.designpattern.decoratorpattern;

public class Simulator {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDesc());
        beverage = new Soy(beverage);
        System.out.println(beverage.getDesc());
        beverage = new Milk(beverage);
        System.out.println(beverage.getDesc());

        System.out.println(beverage.cost());
    }
}
