package com.designpattern.factorypattern;

public class ChicagoPizzaStore extends PizzaStore{
    PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
    @Override
    public Pizza createPizza(String name) {
        Pizza pizza = null;
        if (name.equals("Clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago clam pizza");
        }
        else if(name.equals("Cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago cheese pizza");
        }
        return pizza;
    }
}
