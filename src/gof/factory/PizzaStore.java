package gof.factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = CreatePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza CreatePizza(String type);
}
