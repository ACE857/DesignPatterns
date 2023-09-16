package com.designpattern.factorypattern;

public class NYPizzaStore extends PizzaStore{
    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
    @Override
    public Pizza createPizza(String name) {
        Pizza pizza = null;
        if (name.equals("Clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("NY clam pizza");
        }
        else if(name.equals("Cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY cheese pizza");
        }
        return pizza;
    }
}
