package FileHandling;

import java.io.File;

public class DeleteAFile {
    public static void main(String[] args) {
        File file=new File("demo.txt");
        if(file.delete()){
            System.out.println("File deleted");
        }
        else {
            System.out.println("Some problem occurred while file deletion");
        }
    }
}
