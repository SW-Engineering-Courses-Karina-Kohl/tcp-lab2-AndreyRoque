import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    /* área para a criação dos métodos */
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.display();

    }

    public int soma(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public void display() {

        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        JLabel labelA = new JLabel("A:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(labelA, gbc);

        JTextField inputFieldA = new JTextField(12);
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(inputFieldA, gbc);

        JLabel labelB = new JLabel("B:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(labelB, gbc);

        JTextField inputFieldB = new JTextField(12);
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(inputFieldB, gbc);

        JLabel resultLabel = new JLabel("Result: ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(resultLabel, gbc);

        JButton addButton = new JButton("+");
        gbc.gridx = 2;
        gbc.gridy = 0;
        frame.add(addButton, gbc);

        JButton divButton = new JButton("/");
        gbc.gridx = 2;
        gbc.gridy = 1;
        frame.add(divButton, gbc);



        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try {
                    int num1 = Integer.parseInt(inputFieldA.getText());
                    int num2 = Integer.parseInt(inputFieldB.getText());
                    resultLabel.setText("Result: " + soma(num1, num2));
                } catch (NumberFormatException e) {
                    resultLabel.setText("Invalid input(s)");
                }
            }
        });

        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try {
                    int num1 = Integer.parseInt(inputFieldA.getText());
                    int num2 = Integer.parseInt(inputFieldB.getText());
                    resultLabel.setText(num2 != 0 ? "Result: " + div(num1, num2) : "Divisão por zero");
                } catch (NumberFormatException e) {
                    resultLabel.setText("Invalid input(s)");
                }
            }
        });

        frame.setVisible(true);
    };

}
