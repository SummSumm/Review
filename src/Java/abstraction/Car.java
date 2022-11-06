package Java.abstraction;

public abstract class Car {
    public String brand, model;

    public void drive () {
        System.out.println("Driving a " + brand + " " + model);
    }

    public abstract void start();
    public abstract void stop();
}
