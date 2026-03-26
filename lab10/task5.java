import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task5 extends JPanel implements ActionListener {

    JTextField xField, yField;
    int x = 50, y = 50;

    public task5() {
        xField = new JTextField(5);
        yField = new JTextField(5);
        JButton button = new JButton("Draw");

        button.addActionListener(this);

        add(new JLabel("X:"));
        add(xField);
        add(new JLabel("Y:"));
        add(yField);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            x = Integer.parseInt(xField.getText());
            y = Integer.parseInt(yField.getText());
        } catch (Exception ex) {
            x = 50;
            y = 50;
        }
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 5");
        frame.add(new task5());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}