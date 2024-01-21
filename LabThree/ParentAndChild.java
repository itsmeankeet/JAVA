package LabThree;

class Vechile {
    protected String make;
    protected String model;
    protected int year;

    public void start() {
        System.out.println("This is start method of parent class");
    }

    public void stop() {
        System.out.println("This is the stop method of parent class");
    }

    public void speed() {
        System.out.println("The speed of this vechile is");
    }
}

class Car extends Vechile {
    protected int numberOfDoors;

    public void drift() {
        System.out.println("This is drift function of car");
    }
}

class Motorcycle extends Vechile {
    protected boolean hasFairing;

    public void whilee() {
        System.out.println("This is whilee function in motorcycle");
    }
}
public class ParentAndChild {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.whilee();
        motorcycle.speed();

        Car car = new Car();
        car.start();
        car.stop();
        car.speed();
        car.drift();
    }
}