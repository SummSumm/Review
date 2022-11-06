package Java.abstraction;

public class Tesla extends Car{
    @Override
    public void start() {
        System.out.println(brand + " " + model + " starts with voice recognition");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " stops with voice recognition");
    }
}
