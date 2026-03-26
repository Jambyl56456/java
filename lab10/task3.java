import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task3 extends JPanel implements ActionListener {

    JTextField textField;
    String message = "";

    public task3() {
        textField = new JTextField(15);
        JButton button = new JButton("OK");

        button.addActionListener(this);

        add(textField);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        message = "Сәлем, " + name;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(message, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 3");
        frame.add(new task3());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}