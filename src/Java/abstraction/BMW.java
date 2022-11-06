package Java.abstraction;

public class BMW extends Car implements luxuryCar {
    @Override
    public void start() {
        System.out.println(brand + " " + model + " starts with a button");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " stops with a button");
    }

    @Override
    public void massageChair() {
        System.out.println(brand + " " + model + " has a massage seat");
    }
}
