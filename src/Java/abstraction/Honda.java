package Java.abstraction;

public class Honda extends Car {


    @Override
    public void start() {
        System.out.println(brand + " " + model + " starts with a key");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + "stops with a key");
    }
}
