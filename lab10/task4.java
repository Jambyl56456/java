import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task4 extends JPanel implements ActionListener {

    Color color = Color.RED;

    public task4() {
        JButton button = new JButton("Change Color");
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (color == Color.RED) {
            color = Color.GREEN;
        } else if (color == Color.GREEN) {
            color = Color.BLUE;
        } else {
            color = Color.RED;
        }
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(100, 80, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 4");
        frame.add(new task4());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}