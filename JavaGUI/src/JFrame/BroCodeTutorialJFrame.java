package JFrame;

import javax.swing.*;
import java.awt.*;

public class BroCodeTutorialJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("This is tutorial i learned from JCOde");
        frame.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        JPanel panel2= new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        panel1.setBackground(Color.RED);
        panel5.setBackground(Color.BLUE);
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setBackground(Color.BLACK);
        panel3.setBackground(Color.GREEN);
        panel4.setBackground(Color.DARK_GRAY);
        panel5.setLayout(new BorderLayout());
        //let's create sub pannels
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();
        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));
        panel6.setBackground(Color.RED);
        panel7.setBackground(Color.YELLOW);
        panel8.setBackground(Color.decode("#123456"));
        panel9.setBackground(Color.decode("#dadada"));
        panel10.setBackground(Color.decode("#bababa"));
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);
        panel5.add(panel8,BorderLayout.WEST);
        panel5.add(panel9,BorderLayout.EAST);
        panel5.add(panel10,BorderLayout.CENTER);
        frame.add(panel1,BorderLayout.SOUTH);
        frame.add(panel2,BorderLayout.NORTH);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.WEST);
        frame.add(panel5,BorderLayout.CENTER);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
