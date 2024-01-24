package JPanel;
import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Syntax");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        JLabel label = new JLabel("<html><div style='text-align: left;'>Hello Bro..<br>Let's implement JPanel</div></html>");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        label.setVerticalAlignment(JLabel.TOP);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 70, 200, 200);

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK);
        blackPanel.setBounds(200,270, 200, 200);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(200,270, 200, 200);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(200,270, 200, 200);
        JLabel greenLabel = new JLabel("Green Panel");
        greenPanel.setLayout(new BorderLayout());
        greenPanel.add(greenLabel, BorderLayout.CENTER);

        contentPanel.add(label, BorderLayout.NORTH);
        contentPanel.add(redPanel, BorderLayout.WEST);
        contentPanel.add(blackPanel, BorderLayout.CENTER);
        contentPanel.add(bluePanel, BorderLayout.EAST);
        contentPanel.add(greenPanel, BorderLayout.SOUTH);

        frame.add(contentPanel);
        frame.setVisible(true);
    }
}
