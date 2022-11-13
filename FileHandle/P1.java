package FileHandle;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) throws IOException {
        File file =new File("/Users/varzilthakkar/Desktop/OOPs_Java/FileHandle/demo.txt");
//        String str=file.toString();
//        System.out.println(str);
        FileReader fr=new FileReader(file);
        System.out.println(fr.read());
        fr.close();
    }
}
