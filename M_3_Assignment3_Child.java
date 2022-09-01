// This is the child class calling the parent class and invoking the constructor
import java.util.Scanner;

public class M_3_Assignment3_Child extends M_3_Assignment3 {

    M_3_Assignment3_Child(int n) {
        super(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        M_3_Assignment3 obj=new M_3_Assignment3_Child(n);
    }
}
