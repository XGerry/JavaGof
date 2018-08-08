package gof.factory;

/**
 * 简单工厂模式
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ehan ordered a " + pizza.getName() + "\n");
    }
}
