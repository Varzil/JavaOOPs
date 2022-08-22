import javax.swing.*;

public class Assignment_4 {
    public static void main(String[] args) {
        int a, b, c, max;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter First number:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter Second number:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Enter Third number:"));

        max=Math.max(Math.max(a,b),c);
//        if(a > b) {
//            max = Math.max(a, c);
//        }
//        else {
//            max = Math.max(b, c);
//        }

        JOptionPane.showMessageDialog(null, "Maximum number is: " + max);
    }
}
