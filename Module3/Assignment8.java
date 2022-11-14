package Module3;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 3, 4, 5};
        try {
            System.out.print("Enter an index value: ");
            int i = sc.nextInt();
            int a_ = a[i];
            try {
                System.out.print("Enter a divisor: ");
                int b = sc.nextInt();
                if(b == 0) throw new ArithmeticException();
                System.out.println("Answer: " + (double)a_/b);
            } catch(ArithmeticException e2) {
                System.out.println("Zero division error");
            }
        } catch(ArrayIndexOutOfBoundsException e1) {
            System.out.println("Index Out of Bounds");
        }
    }
}
