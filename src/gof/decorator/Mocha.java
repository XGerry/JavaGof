package gof.decorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String GetDescription() {
        return beverage.GetDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
