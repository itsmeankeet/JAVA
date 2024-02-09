package JFrame;
import javax.swing.*;
import java.awt.*;

public class ButtonBlockFrame {
    public static void main(String[] args) {
        //        JFrame frame = new JFrame("This is new Frame");
//        frame.setLayout(new BorderLayout());
//        JPanel panel = new JPanel();
//        JButton btn1 = new JButton("Button1");
//        JButton btn2 = new JButton("Button2");
//        JButton btn3 = new JButton("Button3");
//        JButton btn4 = new JButton("Button4");
//        JButton btn5 = new JButton("Button5");
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        panel.add(btn1);
//        panel.add(btn2);
//        panel.add(btn3);
//        panel.add(btn4);
//        panel.add(btn5);
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
//        frame.add(panel);
//        frame.setSize(400,400);
//        frame.setVisible(true);

//        JFrame frame = new JFrame("This is my example frame");
//        JPanel panel = new JPanel();
//        JButton btn1 = new JButton("Button1");
//        JButton btn2 = new JButton("Button2");
//        JButton btn3 = new JButton("Button3");
//        JButton btn4 = new JButton("Long Button is this");
//        JButton btn5 = new JButton("Button5");
//
//        // Set BoxLayout for the panel with X_AXIS orientation
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//
//        // Add buttons to the panel
//        panel.add(btn1);
//        panel.add(btn2);
//        panel.add(btn3);
//        panel.add(btn4);
//        panel.add(btn5);
//
//        // Use FlowLayout for the frame's content pane
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
//
//        // Add the panel to the frame
//        frame.add(panel);
//
//        // Set default close operation and make the frame visible
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack(); // Automatically adjusts the frame size based on its components
//        frame.setVisible(true);


//        JFrame frame = new JFrame("This is my JFrame");
//        JPanel label = new JPanel();
//        frame.setLayout(new FlowLayout());
//        label.setLayout(new BoxLayout(label, BoxLayout.Y_AXIS));
//        JButton button1 = new JButton("Button1");
//        JButton button2 = new JButton("Button2");
//        JButton button3 = new JButton("This is very long button");
//        label.add(button1);
//        label.add(button2);
//        label.add(button3);
//        frame.add(label);
//        frame.setSize(400,400);
//        frame.setVisible(true);
        JFrame frame = new JFrame("This is my JFrame");
        JPanel label = new JPanel();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        label.setLayout(new BoxLayout(label, BoxLayout.Y_AXIS));
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("This is a very long button");
        label.add(button1);
        label.add(button2);
        label.add(button3);
        frame.add(label);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
