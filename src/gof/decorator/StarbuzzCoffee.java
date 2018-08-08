package gof.decorator;

/**
 * 装饰者模式
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.GetDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.GetDescription() + " $" + beverage1.cost());
    }
}
