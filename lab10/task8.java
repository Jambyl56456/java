import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task8 extends JPanel implements ActionListener {

    JTextField t1, t2;
    JLabel resultLabel;

    public task8() {
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        JButton addButton = new JButton("+");
        resultLabel = new JLabel("Нәтиже: ");

        addButton.addActionListener(this);

        add(new JLabel("Сан 1:"));
        add(t1);
        add(new JLabel("Сан 2:"));
        add(t2);
        add(addButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sum = a + b;
            resultLabel.setText("Нәтиже: " + sum);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Қате! Сан енгізіңіз.");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 8 - Calculator");
        frame.add(new task8());
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}