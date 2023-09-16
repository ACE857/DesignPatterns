package com.designpattern.factorypattern;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggies[];
    Clam clam;

    abstract void prepare();

    void bake() {
        System.out.println("Baking...");
    }

    void cut() {
        System.out.println("Cutting...");
    }

    void box() {
        System.out.println("Boxing...");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

}
