package Module4;

import javax.swing.*;
import java.awt.*;
class Assignment10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Assignment 10");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        JButton button;
        for(int i = 1; i < 10; i++) {
            button = new JButton(i+"");
            panel.add(button);
        }
        JPanel main = new JPanel();
        main.setLayout(new CardLayout(10, 10));
        main.add("Numbers", panel);
        frame.setContentPane(main);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}