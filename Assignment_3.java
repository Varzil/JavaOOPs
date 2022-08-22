import java.io.InputStreamReader;
import java.util.Scanner;

// Write a program to enter two numbers and perform mathematical operations on them.
public class Assignment_3 {
    void calculator(int n,int m){
        System.out.println("Addition "+(n+m));
        System.out.println("Subtraction "+(n-m));
        System.out.println("Multiplication "+(n*m));
        System.out.println("Division "+(n/(float)m));
        System.out.println("Modulus "+(n%m));

    }
    public static void main(String[] args) {
        int n1,n2;
        InputStreamReader isr=new InputStreamReader(System.in);
        Scanner sc=new Scanner(isr);
        Assignment_3 obj=new Assignment_3();
        System.out.println("Enter 2 numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        obj.calculator(n1,n2);
    }
}
