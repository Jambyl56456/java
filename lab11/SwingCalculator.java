import javax.swing.*;
import java.awt.*;

public class SwingCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculator");
            frame.setSize(400, 450);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JTextField textField1 = new JTextField(10);
            JTextField textField2 = new JTextField(10);
            JLabel resultLabel = new JLabel("Result: —", SwingConstants.CENTER);
            resultLabel.setFont(new Font("Arial", Font.BOLD, 16));

            JButton addButton      = new JButton("+");
            JButton subtractButton = new JButton("−");
            JButton multiplyButton = new JButton("×");
            JButton divideButton   = new JButton("÷");

            for (JButton btn : new JButton[]{addButton, subtractButton, multiplyButton, divideButton}) {
                btn.setFont(new Font("Arial", Font.BOLD, 20));
                btn.setPreferredSize(new Dimension(80, 50));
            }

            // Панель ввода
            JPanel inputPanel = new JPanel(new GridLayout(2, 2, 8, 8));
            inputPanel.setBorder(BorderFactory.createTitledBorder("Input"));
            inputPanel.add(new JLabel("Number 1:"));
            inputPanel.add(textField1);
            inputPanel.add(new JLabel("Number 2:"));
            inputPanel.add(textField2);

            // Панель кнопок
            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
            buttonPanel.setBorder(BorderFactory.createTitledBorder("Operation"));
            buttonPanel.add(addButton);
            buttonPanel.add(subtractButton);
            buttonPanel.add(multiplyButton);
            buttonPanel.add(divideButton);

            // Панель результата
            JPanel resultPanel = new JPanel();
            resultPanel.setBorder(BorderFactory.createTitledBorder("Result"));
            resultPanel.add(resultLabel);

            // Вспомогательный метод для парсинга
            // Используем лямбды с общей логикой
            Runnable showError = () -> resultLabel.setText("Error: invalid input");

            addButton.addActionListener(e -> {
                try {
                    double n1 = Double.parseDouble(textField1.getText());
                    double n2 = Double.parseDouble(textField2.getText());
                    resultLabel.setText("Result: " + (n1 + n2));
                } catch (NumberFormatException ex) { showError.run(); }
            });

            subtractButton.addActionListener(e -> {
                try {
                    double n1 = Double.parseDouble(textField1.getText());
                    double n2 = Double.parseDouble(textField2.getText());
                    resultLabel.setText("Result: " + (n1 - n2));
                } catch (NumberFormatException ex) { showError.run(); }
            });

            multiplyButton.addActionListener(e -> {
                try {
                    double n1 = Double.parseDouble(textField1.getText());
                    double n2 = Double.parseDouble(textField2.getText());
                    resultLabel.setText("Result: " + (n1 * n2));
                } catch (NumberFormatException ex) { showError.run(); }
            });

            divideButton.addActionListener(e -> {
                try {
                    double n1 = Double.parseDouble(textField1.getText());
                    double n2 = Double.parseDouble(textField2.getText());
                    if (n2 == 0) {
                        resultLabel.setText("Error: Division by zero");
                    } else {
                        resultLabel.setText("Result: " + (n1 / n2));
                    }
                } catch (NumberFormatException ex) { showError.run(); }
            });

            // Сборка окна
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            mainPanel.add(inputPanel);
            mainPanel.add(Box.createVerticalStrut(10));
            mainPanel.add(buttonPanel);
            mainPanel.add(Box.createVerticalStrut(10));
            mainPanel.add(resultPanel);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }
}