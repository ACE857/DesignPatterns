package com.designpattern.factorypattern;

public class Simulator {
    public static void main(String[] args) {
        PizzaStore chPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoCheesePizza = chPizzaStore.createPizza("Cheese");
        System.out.println(chicagoCheesePizza.getName());

        PizzaStore nyPizzaStore = new ChicagoPizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.createPizza("Clam");
        System.out.println(nyCheesePizza.getName());
    }
}
