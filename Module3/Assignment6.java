package Module3;
import java.io.*;
import java.util.*;
//
public class Assignment6 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader fin = new BufferedReader(new FileReader("student.txt"));
        System.out.println("File contents:");
        String s = "";
        ArrayList<String> arr = new ArrayList<String>();
        for(s = fin.readLine(); s != null; s=fin.readLine()) {
            System.out.println(s);
            arr.add(s);
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
            id_ = 1;
        }
        if(choice  == 3) {
            System.out.print("Enter new discipline: ");
            id_ = 2;
        }
        sc.nextLine();
        String s_ = sc.nextLine();
        System.out.println(s_);
        if(id_ >= 1 && id_ <= 3)
            arr.set(id_, s_);
        PrintWriter fout = new PrintWriter(new FileWriter("student.txt"));
        for (String value : arr) fout.println(value);
        fout.close();

    }
}
