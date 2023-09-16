package com.designpattern.factorypattern;

// This is abstract factory which is used to create a family of products, each subclass implements products acc
// to its own specification.
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Clam createClam();
    Cheese createCheese();
    Veggies[] createVeggies();
}
