package Module3;

import java.io.FileWriter;
import java.io.IOException;

// Read from a file convert it to uppercase and save it into another file.

public class Assignment2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("/Users/varzilthakkar/Desktop/OOPs_Java/demo.txt");
            fw.write("Files in Java might be tricky, but it is fun enough!");
            fw.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
