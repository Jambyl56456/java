import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task10 extends JPanel implements ItemListener {

    JCheckBox redBox, greenBox, blueBox;
    Color color = Color.RED;

    public task10() {
        redBox = new JCheckBox("Red");
        greenBox = new JCheckBox("Green");
        blueBox = new JCheckBox("Blue");

        redBox.addItemListener(this);
        greenBox.addItemListener(this);
        blueBox.addItemListener(this);

        add(redBox);
        add(greenBox);
        add(blueBox);
    }

    public void itemStateChanged(ItemEvent e) {
        if (redBox.isSelected()) color = Color.RED;
        else if (greenBox.isSelected()) color = Color.GREEN;
        else if (blueBox.isSelected()) color = Color.BLUE;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(150, 80, 100, 100); // боялатын фигура
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 10 - Checkbox Color");
        frame.add(new task10());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}