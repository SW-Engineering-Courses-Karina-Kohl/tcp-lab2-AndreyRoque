import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI{

    private JFrame frame;
    private JTextField inputFieldA, inputFieldB;
    private JLabel labelA, labelB, resultField;
    private JButton addButton, divButton;
    private CalculadoraOP op = new CalculadoraOP();
    private static final int inputTextSize = 12;

    public void display() {
        
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        addComponents(gbc);

        frame.setVisible(true);
    };

    public void addComponents(GridBagConstraints gbc){
        
        labelA = new JLabel("A: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(labelA, gbc);

        inputFieldA = new JTextField(inputTextSize);
        gbc.gridx = 1;
        frame.add(inputFieldA, gbc);

        inputFieldB = new JTextField(inputTextSize);
        gbc.gridy = 1;
        frame.add(inputFieldB, gbc);

        labelB = new JLabel("B: ");
        gbc.gridx = 0;
        frame.add(labelB, gbc);

        resultField = new JLabel("Resultado: ");
        gbc.gridy = 2;
        frame.add(resultField, gbc);

        addButton = new JButton("+");
        gbc.gridx = 2;
        gbc.gridy = 0;
        frame.add(addButton, gbc);

        divButton = new JButton("/");
        gbc.gridy = 1;
        frame.add(divButton, gbc);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try {
                    int num1 = Integer.parseInt(inputFieldA.getText().trim());
                    int num2 = Integer.parseInt(inputFieldB.getText().trim());
                    resultField.setText("Result: " + op.soma(num1, num2));
                } catch (NumberFormatException e) {
                    resultField.setText("Invalid input(s)");
                }
            }
        });

        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try {
                    int num1 = Integer.parseInt(inputFieldA.getText().trim());
                    int num2 = Integer.parseInt(inputFieldB.getText().trim());
                    resultField.setText(num2 != 0 ? "Result: " + op.div(num1, num2) : "Divisão por zero");
                } catch (NumberFormatException e) {
                    resultField.setText("Invalid input(s)");
                }
            }
        });
    } 
}

