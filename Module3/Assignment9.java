package Module3;

import java.util.Scanner;

class AgeIsNegative extends Exception {
    String errorMessage;
    public AgeIsNegative(String error) {
        this.errorMessage = error;
    }
    public String toString() {
        return this.errorMessage;
    }
}

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int a = sc.nextInt();
            if(a < 0)
                throw new AgeIsNegative("Age cannot be negative");
        } catch(AgeIsNegative ex) {System.out.println(ex);}
    }
}
