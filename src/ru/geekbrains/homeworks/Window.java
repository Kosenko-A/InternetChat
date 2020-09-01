package ru.geekbrains.homeworks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 200, 700, 400);
        setVisible(true);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JTextField showField = new JTextField();
        showField.setEditable(false);
        add(showField);

        JTextField messageField = new JTextField();
        add(messageField);
        messageField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showField.setText(messageField.getText());
            }
        });

        JButton button = new JButton("Отправить");
        add(button);
        button.setBackground(new Color(113, 88, 240));
        setVisible(true);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showField.setText(messageField.getText());
            }
        });

    }
}
