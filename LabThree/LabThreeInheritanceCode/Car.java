package LabThree.LabThreeInheritanceCode;

public class Car extends Vechile{
    private int numberOfDoors;

    Car(String model, String make, int year) {
        super(model,make,year);
    }
    public void drift() {
        System.out.println("Hurry!! I am showing drift from Car class");
    }
    @Override
    public void start() {
        System.out.println("Hurry!! We override method start in Car class");
    }

    @Override
    public void stop() {
        System.out.println("Hurry!! We override method stop in Car class");
    }

    @Override
    public void showDetails () {
        System.out.println("Car's Model: "+this.model);
        System.out.println("Manufactured Material: "+this.make);
        System.out.println("Manufactured Year: "+this.year);

    }
}
