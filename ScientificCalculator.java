/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScientificCalculator extends JFrame {
    private JTextField displayTextField;

    public ScientificCalculator() {
        super("Scientific Calculator");

        // Initialize components
        displayTextField = new JTextField(20);
        displayTextField.setEditable(false);

        // Layout components
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(displayTextField, BorderLayout.NORTH);
        // Add other buttons and components

        // Add action listeners
        // Define action listener for numeric buttons
        ActionListener numericButtonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String buttonText = button.getText();
                // Append the clicked digit to the display area
                displayTextField.setText(displayTextField.getText() + buttonText);
            }
        };

        // Attach the numeric button listener to each numeric button
        JButton[] numericButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numericButtons[i] = new JButton(String.valueOf(i));
            numericButtons[i].addActionListener(numericButtonListener);
            // Add each numeric button to the layout
        }

        // Add other button listeners and operations

        // Set up JFrame
        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalculator();
            }
        });
    }
}

