package Assignment;

import java.util.Scanner;
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super("Error: " + message);
    }
}
class Time {
    private int hour, minute, second;
    private static int count;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
        count += 1;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(Time ob) {
        this.hour = ob.hour;
        this.minute = ob.minute;
        this.second = ob.second;
    }

    public void hoursToTime(double hourFloat) {
        this.hour = (int) hourFloat % 24;
        double remainingMinutes = (hourFloat - this.hour) * 60;
        this.minute = (int) remainingMinutes % 60;
        double remainingSeconds = (remainingMinutes - this.minute) * 60;
        this.second = (int) remainingSeconds;
    }

    public void minuteToTime(double minute) {
        this.hour = (int) minute / 60;
        this.minute = (int) (minute - (this.hour * 60));
        double remaniningMinute = minute - (this.hour * 60 + this.minute);
        this.second = (int) (remaniningMinute * 60);
    }

    public void secondToTime(int second) {
        this.hour = second / 3600;
        int remainingSecondsAfterHours = second % 3600;

        this.minute = remainingSecondsAfterHours / 60;
        this.second = remainingSecondsAfterHours % 60;
    }

    public int getHour() {
        return (this.hour);
    }

    public int getMinute() {
        return (this.minute);
    }

    public int getSecond() {
        return (this.second);
    }

    public void setHour(double hour) throws InvalidInputException{
        if(hour < 0) 
            throw new InvalidInputException("Hour cannot be negative");
        hoursToTime(hour);
    }

    public void setMinute(double minute) throws InvalidInputException {
        if(minute < 0)
            throw new InvalidInputException("Minute cannot be negative");
        minuteToTime(minute);
    }

    public void setSecond(int second) throws InvalidInputException{
        if(second < 0)
            throw new InvalidInputException("Second cannot be negative");
        secondToTime(second);
    }

    public int getCount() {
        return count;
    }

    public void display() {
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }
}

public class labtwoAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time();

        int choice;
        do {
            System.out.println("\nEnter your choice for the operation");
            System.out.println(
                    "1. Set Hour\n2. Set Minute\n3. Set Second\n4. Set Hour/Minute/Second\n5. Hour to Time\n6. Minute to Time\n7. Second to Time\n8. Display Hour:Minute:Second\n9. Display Minute:Minute\n10. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.println("Enter the hour:");
                        int hour = scanner.nextInt();
                        time.setHour(hour);
                        System.out.println("Hour set to " + hour);
                    }catch(InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Enter the minute:");
                        int minute = scanner.nextInt();
                        time.setMinute(minute);
                        System.out.println("Minute set to " + minute);
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Enter the second:");
                        int second = scanner.nextInt();
                        time.setSecond(second);
                        System.out.println("Second set to " + second);
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Enter the hour:");
                    int h = scanner.nextInt();
                    System.out.println("Enter the minute:");
                    int m = scanner.nextInt();
                    System.out.println("Enter the second:");
                    int s = scanner.nextInt();
                    System.out.println("Using Paramenterized Constructor");
                    Time ob2 = new Time(h,m,s);
                    ob2.display();
                    Time ob3 = new Time(ob2);
                    System.out.println("Using Copy Constructor");
                    ob3.display();
                    break;

                case 5:
                    System.out.println("Enter the hour as a float:");
                    double hourFloat = scanner.nextDouble();
                    time.hoursToTime(hourFloat);
                    System.out.println("Converted to Time: ");
                    time.display();
                    break;

                case 6:
                    System.out.println("Enter the minute as a float:");
                    double minuteFloat = scanner.nextDouble();
                    time.minuteToTime(minuteFloat);
                    System.out.println("Converted to Time: ");
                    time.display();
                    break;

                case 7:
                    System.out.println("Enter the second:");
                    int sec = scanner.nextInt();
                    time.secondToTime(sec);
                    System.out.println("Converted to Time: ");
                    time.display();
                    break;

                case 8:
                    System.out.println("Displaying Hour:Minute:Second");
                    time.display();
                    break;

                case 9:
                    System.out.println("Displaying Minute:Minute");
                    System.out.println(time.getMinute());
                    break;

                case 10:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        System.out.println("Total instances: " + time.getCount());
        scanner.close();
    }
}


// getMessage() is a method which is defined in throwable class which is the base class of all exceptions