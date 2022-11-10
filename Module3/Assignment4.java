package Module3;

// Create a class called Student. Write  a student manager program to manipulate
// the student information from files by using FileInputStream and FileOutputStream

import java.io.*;
import java.util.*;
public class Assignment4 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        FileInputStream fin = new FileInputStream("/student.txt");
        System.out.println("File contents:");
        int ch;
        StringBuilder s = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        while((ch = fin.read()) != -1) {
            System.out.print((char)ch);
            if((char)ch == '\n') {
                arr.add(s.toString());
                s = new StringBuilder();
            } else s.append((char) ch);
        }
        fin.close();
        System.out.println("Enter which field you want to edit: ");
        System.out.print("1. Name\n2. Degree\n3. Discipline\n:");
        int id_ = -1, choice = sc.nextInt();
        if(choice == 1) {
            System.out.print("Enter new name: ");
            id_ = 0;
        }
        if(choice == 2) {
            System.out.print("Enter new degree: ");
            id_ = 1; }
        if(choice  == 3) {
            System.out.print("Enter new discipline: ");
            id_ = 2;
        }
        String s_ = sc.nextLine();
        System.out.println(s_);
        if(id_ >= 1)
            arr.set(id_, s_);
        s = new StringBuilder();
        FileOutputStream fout = new FileOutputStream("/student.txt");
        for (String value : arr) {
            s.append(value).append('\n');
        }
        char[] ch_ = s.toString().toCharArray();
        for(int i = 0; i < s.length(); i++)
            fout.write(ch_[i]);
        fout.close();

    }
}
