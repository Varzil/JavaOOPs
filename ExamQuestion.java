import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Write a program to accept the id through a GUI and Display details of the Mobile
// at the bottom of the GUI once the user will click on the Search button.

public class ExamQuestion {
    static String[] result = new String[4];
    public static void main(String[] args) {

        JFrame frame = new JFrame("Mobile Search");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JLabel idLabel = new JLabel("ID");
        frame.add(idLabel);

        JTextField idField = new JTextField();
        frame.add(idField);

        JButton searchButton = new JButton("Search");
        frame.add(searchButton);

        JLabel ModelLabel = new JLabel("Model :");
        frame.add(ModelLabel);

        JTextField ModelField = new JTextField();
        frame.add(ModelField);

        JLabel BrandLabel = new JLabel("Brand :");
        frame.add(BrandLabel);

        JTextField BrandField = new JTextField();
        frame.add(BrandField);

        JLabel PriceLabel = new JLabel("Price :");
        frame.add(PriceLabel);

        JTextField PriceField = new JTextField();
        frame.add(PriceField);


        searchButton.addActionListener(e -> {
            String id = idField.getText();
            boolean isFound=checkFor(id);
            if (isFound){
                BrandField.setText(result[3]);
                ModelField.setText(result[1]);
                PriceField.setText(result[2]);
            }
            else{
                BrandField.setText("Error");
                ModelField.setText("Error");
                PriceField.setText("Error");
            }

        });
    }
    static boolean checkFor(String id){
        File f=new File("/Users/varzilthakkar/Desktop/OOPs_Java/Devices.txt");

        try {
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                String[] arr=line.split(",");
                if (arr[0].equals(id)) {
                    try {
                        result[0]=arr[0];
                        result[1]=arr[1];
                        result[2]=arr[2];
                        result[3]=arr[3];
                        return true;
                    }
                    catch (Exception e){
                        System.out.println("Error while going through the data");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
