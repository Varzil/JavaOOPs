package AWT;

import java.awt.*;

public class MyFrame extends Frame {
    public MyFrame(String title) {
        super(title);
        setSize(300, 300);
        setLayout(new FlowLayout());
        add(new Label("Enter your name"));
        add(new TextField(20));
        add(new Button("Click me"));
        setVisible(true);
    }
}
