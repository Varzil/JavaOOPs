package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("demo.txt");
            fileWriter.write("This is how to write to a file");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
