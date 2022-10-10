package Module3;
// Read a content from file: calculate number of sentences, words and characters from the file.

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/varzilthakkar/Desktop/OOPs_Java/demo.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
