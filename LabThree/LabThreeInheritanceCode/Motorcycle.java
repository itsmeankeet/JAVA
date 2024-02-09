package LabThree.LabThreeInheritanceCode;

public class Motorcycle extends Vechile{
    private boolean hasFairing;
    Motorcycle(String model, String make, int year) {
        super(model,make,year);
    }
    public void whilee() {
        System.out.println("Hurrry! I am doing whileee in Motorcycle class");
    }

    @Override
    public void start() {
        System.out.println("Hurry!! I override the start method in Motorbike Class");
    }

    @Override
    public void stop() {
        System.out.println("Hurry!! I override the stop method in Motorbike Class");
    }

    @Override
    public void showDetails() {
        System.out.println("Motorbike Model: "+this.model);
        System.out.println("Manufactured Materials: "+this.make);
        System.out.println("Manufactured Year: "+this.year);
    }
}
