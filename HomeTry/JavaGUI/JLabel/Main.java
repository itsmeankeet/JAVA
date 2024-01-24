import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("This is my Assignment");
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("South"), BorderLayout.SOUTH);

        JPanel gridPanel = new JPanel(new GridLayout(3, 2));
        gridPanel.add(new JLabel("Name"));
//        {{
//            setHorizontalTextPosition(JLabel.CENTER);
//            setFont(new Font("Arial", Font.BOLD, 30));
//        }}
//        );
        gridPanel.add(new JTextField(4));
        gridPanel.add(new JLabel("Roll"));
//        {{
//            setHorizontalTextPosition(JLabel.CENTER);
//            setFont(new Font("Arial", Font.BOLD, 30));
//        }}
        gridPanel.add(new JTextField());
        gridPanel.add(new JLabel("Address"));
//        {{
//            setHorizontalTextPosition(JLabel.CENTER);
//            setFont(new Font("Arial", Font.BOLD, 30));
//        }});
        gridPanel.add(new JTextField(4));
        frame.add(gridPanel, BorderLayout.CENTER);

        // Menubar
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        JMenuItem saveMenu = new JMenuItem("Save");
        JMenuItem saveAsMenu = new JMenuItem("Save As");
        JMenuItem exitMenu = new JMenuItem("Exit");

        JMenuItem formatiMenu = new JMenu("Format");

        JMenuItem boldMenu = new JMenuItem("Bold");
        JMenuItem itallicMenu = new JMenuItem("Itallic");
        JMenuItem underlineMenu = new JMenuItem("Underline");

        formatiMenu.add(boldMenu);
        formatiMenu.add(itallicMenu);
        formatiMenu.add(underlineMenu);

        editMenu.add(formatiMenu);
        fileMenu.add(saveMenu);
        fileMenu.add(saveAsMenu);
        fileMenu.add(exitMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

//        frame.add(menuBar, BorderLayout.NORTH);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
