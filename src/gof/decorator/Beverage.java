package gof.decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String GetDescription() {
        return description;
    }

    public abstract double cost();

}
