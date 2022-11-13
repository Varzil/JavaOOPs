package Module4;
import java.awt.*;
import java.awt.event.*;

// WAP to create a Dialogbox.
public class Assignment8 {
    private static Dialog d;
    Assignment8() {
        Frame f= new Frame();
        d = new Dialog(f , "Dialog Example", true);
        d.setLayout( new FlowLayout() );
        Button b = new Button ("OK");
        b.addActionListener ( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                Assignment8.d.setVisible(false);
            }
        });
        d.add( new Label ("Click button to continue."));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }
    public static void main(String[] args){
        new Assignment8();
    }
}