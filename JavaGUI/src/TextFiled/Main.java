import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JFrame frame;
    private JPanel panel;
    private JLabel nameLabel, ageLabel;
    private JTextField nameTextField, ageTextField;
    private JButton submitButton;

    public Main() {
        frame = new JFrame("User Information Form");
        panel = new JPanel();
        nameLabel = new JLabel("Name: ");
        ageLabel = new JLabel("Age: ");
        nameTextField = new JTextField(20);
        ageTextField = new JTextField(3);
        submitButton = new JButton("Submit");

        // Set layout
        panel.setLayout(new GridLayout(3, 2));

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(ageLabel);
        panel.add(ageTextField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(submitButton);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String age = ageTextField.getText();
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nAge: " + age, "Form Submitted", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
