package Program4;
import java.lang.reflect;

import java.util.Scanner;
public class JavaTest {
    public static void main(String[] args) {
//        //Program 3 ko testing
//        System.out.println("Enter the name of the Shape");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("Enter the colour of that Shape");
//        String colour = scanner.nextLine();
//
//        if(name.equals("Circle") || name.equals("circle")) {
//            System.out.println("Enter the radius of the circle ");
//            double radius = scanner.nextInt();
//            Circle circle = new Circle(name, colour, radius);
//            System.out.println("The area of the given circle is: "+ circle.calculateArea()+"\nThank you");
//        }
//
//        else if(name.equals("Rectangle") || name.equals("rectangle")) {
//            System.out.println("Enter the length of the rectangle ");
//            int length = scanner.nextInt();
//            System.out.println("Enter the breadth of the rectangle ");
//            int breadth = scanner.nextInt();
//            Rectangle rectangle = new Rectangle(name, colour, length, breadth);
//            System.out.println("The area of the given Rectangle is: "+ rectangle.calculateArea() +"\nThank you");
//        } else {
//            System.out.println("Cannot Find the area");
//        }
//        scanner.close();
        Circle c1 = new Circle("Circel", "blaack", 3);
        Class obj = c1.getClass();
        String name = obj.getName();
        System.out.println("Name: "+ name);
//    }
    }
}
