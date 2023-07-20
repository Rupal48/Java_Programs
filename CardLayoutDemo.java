/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo {
    private JPanel cardPanel;
    private CardLayout cardLayout;
    
    public CardLayoutDemo() {
        JFrame frame = new JFrame("Card Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        JPanel card1 = new JPanel();
        card1.setBackground(Color.RED);
        JLabel label1 = new JLabel("Card 1");
        card1.add(label1);

        JPanel card2 = new JPanel();
        card2.setBackground(Color.GREEN);
        JLabel label2 = new JLabel("Card 2");
        card2.add(label2);

        JPanel card3 = new JPanel();
        card3.setBackground(Color.BLUE);
        JLabel label3 = new JLabel("Card 3");
        card3.add(label3);

        cardPanel.add(card1, "card1");
        cardPanel.add(card2, "card2");
        cardPanel.add(card3, "card3");

        JPanel buttonPanel = new JPanel();
        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");

        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cardPanel);
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CardLayoutDemo();
            }
        });
    }
}
