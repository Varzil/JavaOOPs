package AWT;
import java.awt.*;
// import all classes from java.awt package

// The class FirstFrame has a Frame, if it extends Frame then it is a Frame
class FirstFrame {
    public static void main(String[] args) {
        Frame f =new Frame("Mera frame"); // create a frame
        Button b = new Button("Click me"); // create a button
        TextField tf =new TextField(20); // create a text field
        Label l=new Label("Enter your name"); // create a label

        f.setSize(300,300); // set the size of frame
        f.setLayout(new FlowLayout()); // set the layout of frame

        f.add(l); // add label to frame
        f.add(tf); // add text field to frame
        f.add(b); // add button to frame

        f.setVisible(true); // make frame visible
    }
}