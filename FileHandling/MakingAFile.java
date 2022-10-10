package FileHandling;

import java.io.File;
import java.io.IOException;

public class MakingAFile {
    public static void main(String[] args) {
        // We need to create a file using the file class in Java.
        File file=new File("demo2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
