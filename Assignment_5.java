// Write a program in Java to find maximum of three numbers using conditional operator.
import javax.swing.*;

public class Assignment_5{
    public static void main(String[] args) {
        int a, b, c, max;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter First number:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter Second number:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Enter Third number:"));

        max=(a>b)?Math.max(a,c):Math.max(b,c);
//        if(a > b) {
//            max = Math.max(a, c);
//        }
//        else {
//            max = Math.max(b, c);
//        }

        JOptionPane.showMessageDialog(null, "Maximum number is: " + max);
    }
}
