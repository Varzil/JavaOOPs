package Module3;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the dividend: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of the divisor: ");
        int b = sc.nextInt();

        try {
            if(b == 0)
                throw new ArithmeticException();
            System.out.println("ANSWER:" + (double)a/b);
        } catch(ArithmeticException e) {System.out.println("Divisor cannot be zero");}
    }
}
