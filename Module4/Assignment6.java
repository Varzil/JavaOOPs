package Module4;

import javax.swing.*;
import java.awt.event.*;
class MenuTest implements ActionListener
{
    JFrame fr;
    JMenuBar bar;
    JMenu m,n;
    JMenuItem m1,m2,m3,n1,n2,n3;
    JTextArea ta;
    MenuTest() {
        fr=new JFrame();
        fr.setSize(400,400);
        fr.setLayout(null);

        ta=new JTextArea();
        ta.setBounds(0,0,fr.getWidth(),fr.getHeight());
        fr.add(ta);

        bar=new JMenuBar();
        fr.setJMenuBar(bar);

        m=new JMenu("Color");
        m.setMnemonic(KeyEvent.VK_R);
        n= new JMenu("File");
        bar.add(m);
        bar.add(n);

        m1=new JMenuItem("Red");
        m.add(m1);
        m2=new JMenuItem("Green");
        m.add(m2);
        m3=new JMenuItem("Yellow");
        m.add(m3);

        n1=new JMenuItem("open");
        n2=new JMenuItem("save");
        n3=new JMenuItem("print");
        n.add(n1);
        n.add(n2);
        n.add(n3);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

// WAP to create a Menu using the frame.
public class Assignment6 {
    public static void main(String[] args) {
        MenuTest obj=new MenuTest();
    }
}
