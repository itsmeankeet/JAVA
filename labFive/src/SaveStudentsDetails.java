import javax.swing.*;

public class SaveStudentsDetails {
    private String[] names;
    private String[] addresses;
    private int[] rolls;
    private int[] classes;
    private int count;

    public SaveStudentsDetails(String name, String address, int roll, int studentClass, int capacity) {
        names = new String[capacity];
        addresses = new String[capacity];
        rolls = new int[capacity];
        classes = new int[capacity];
        count = 0; // Initialize count to 0
        names[count] = name;
        addresses[count] = address;
        rolls[count] = roll;
        classes[count] = studentClass;
        count++; // Increment count
    }

    public SaveStudentsDetails() {
        JFrame frame = new JFrame("Displaying Students Details");
        JPanel panel = new JPanel();
        JList list = new JList(this.addresses);
        int begin = 0;
        int end = list.getModel().getSize() - 1;
        if(end >= 0) {
            list.setSelectionInterval(begin, end);
        }
        panel.add(list);
        JList name = new JList(this.names);
        end = name.getModel().getSize() - 1;
        if(end >= 0) {
            list.setSelectionInterval(begin, end);
        }
        panel.add(name);
        JList<Integer> roll = new JList<>(convertToIntegers(rolls));
        panel.add(roll);
        JList<Integer> studentClasses = new JList<>(convertToIntegers(this.classes));
        panel.add(studentClasses);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(400,400);
    }

    private static Integer[] convertToIntegers(int[] array) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public void displayStudentDetails() {
        System.out.println("Student Details:");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Address: " + addresses[i]);
            System.out.println("Roll: " + rolls[i]);
            System.out.println("Class: " + classes[i]);
            System.out.println(); // Print a blank line between each student's details
        }
    }
}
