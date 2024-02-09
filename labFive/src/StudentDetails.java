import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDetails{
    JFrame frame = new JFrame("Enter the details of the students");
    JPanel panel = new JPanel();
    JButton button1 = new JButton("View");
    JButton button2 = new JButton("Register");

    StudentDetails() {
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());
        JLabel label = new JLabel();
        label.setText("Select Any Option");
        frame.add(label, BorderLayout.NORTH);
        contentPanel.add(button1, BorderLayout.CENTER);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button2) {
                    frame.dispose();
                    StudentDetails studentDetails = new StudentDetails();
                }
            }
        });
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button1) {
                    frame.dispose();
                    SaveStudentsDetails saveStudentsDetails = new SaveStudentsDetails();
                }
            }
        });
        contentPanel.add(button2, BorderLayout.CENTER);
        contentPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        frame.add(contentPanel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(400,400);
    }
}
