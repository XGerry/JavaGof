package gof.command;

public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + "Light is on!");
    }

    public void off() {
        System.out.println(this.name + "Light is off!");
    }
}
