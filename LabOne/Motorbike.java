public class Motorbike {
    int speed;
    String model;

    public Motorbike(String model)
    {
        this.model = model;
    }

    public void accelerte()
    {
        this.speed += 1;
    }

    public void brake()
    {
        this.speed -= 1;
    }

    public void stop()
    {
        this.speed = 0;
    }

    public int returnSpeed()
    {
        return (this.speed);
    }

    public static void main(String[] args) {
        Motorbike motor = new Motorbike("Honda");
        motor.accelerte();
        motor.brake();
        motor.accelerte();
        motor.accelerte();
        motor.accelerte();
        motor.accelerte();
        System.out.println("The speed of the motor is: "+ motor.returnSpeed()+ "km/hr");
        System.out.println("Stopping Motorbike");
        motor.stop();
        System.out.println("The speed of the motor is: "+ motor.returnSpeed()+ "km/hr");
        return;
    }
}
