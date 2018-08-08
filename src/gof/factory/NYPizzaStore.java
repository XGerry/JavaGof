package gof.factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza CreatePizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else return null;
    }
}
