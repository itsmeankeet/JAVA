package LabThree.LabThreeInheritanceCode;

public class Vechile {
    protected String make;
    protected String model;
    protected int year;

    public Vechile() {
        this.model = null;
        this.make = null;
        this.year = 0;
    }

    public Vechile(String model, String make, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void start() {
        System.out.println("Let's start vechile from Vechile class");
    }

    public void stop() {
        System.out.println("Let's stop vechile from Vechile class");
    }

    public int year() {
        System.out.println("Let's find the manufactured date of Vechile used year method in Vechile Class");
        return (this.year);
    }

    public void showDetails() {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Motorcycle ob = new Motorcycle("Yamaha", "Plastics And Steel", 2010);
        ob.showDetails();
        ob.start();
        ob.whilee();
        ob.stop();
        Car ob1 = new Car("Tesla", "Stell, Almunium And Platics", 2005);
        ob1.showDetails();
        ob1.start();
        ob1.drift();
        ob1.stop();
    }
}
