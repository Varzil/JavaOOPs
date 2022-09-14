package Module1;// Write a program in Java to create a simple scientific calculator using Math Class
import java.util.Scanner;
public class Assignment_13 {
    static void Addition(int num1, int num2) {
        int add=num1+num2;
        System.out.println(("Answer: "+add));
    }
    static void Subtraction(int num1, int num2) {
        int sub=num1-num2;
        System.out.println(("Answer: "+sub));
    }
    static void Multiplication(int num1, int num2) {
        int mul=num1*num2;
        System.out.println(("Answer: "+mul));
    }
    static void Division(int num1, int num2) {
        if (num2!=0) {
            int div=num1/num2;
            System.out.println(("Answer: "+div));
        }
        else
            System.out.println("Num2 cannot be zero.");
        }
    static void squareRoot(int num) {
        double root = Math.sqrt(num);
        System.out.println("The root of "+num+" is "+root);
    }
    static void cubeRoot(int num) {
        System.out.println("Num2 cannot be zero.");
        double root = Math.cbrt(num);
        System.out.println("The cube root of "+num+" is "+root);
    }
    static void square(int num) {
        double root = Math.pow(num,2);
        System.out.println("The square of "+num+" is "+root);
    }
    static void trigo() {
        System.out.println("-----------------");
        System.out.println("1.Sine");
        System.out.println("2.Cosine");
        System.out.println("3.Tangent");
        System.out.println("-----------------");
        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();
        System.out.println("-----------------");
        System.out.println("Enter the angle (in radians) :");
        double angle = s.nextDouble();
        System.out.println("-----------------");
        switch (ch) {
            case 1:
                double ans = Math.sin(angle);
                System.out.println("Answer: " + ans);
                break;
            case 2:
                double ans2 = Math.cos(angle);
                System.out.println("Answer: " + ans2);
                break;
            case 3:
                double ans3 = Math.tan(angle);
                System.out.println("Answer: " + ans3);
                break;
            default:
                System.out.println("The entered choice ");
        }
    }
        public static void main(String[] args) {
            System.out.println("---------------------------------- -");
            System.out.println("Enter your choice of operation:");
            System.out.println("---------------------------------- -");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Square Root");
            System.out.println("6.Cube root");
            System.out.println("7.Square");
            System.out.println("8.Trigonometric Functions");
            System.out.println("---------------------------------- -");

            Scanner sc = new Scanner(System.in);
            int ch1 = sc.nextInt();
            if (ch1 == 1|| ch1==2||ch1==3||ch1==4) {
                int num1,num2;
                System.out.println("Enter num1:");
                num1 = sc.nextInt();
                System.out.println("Enter num2:");
                num2 = sc.nextInt();
                if (ch1==1)
                    Addition(num1, num2);
                else if(ch1==2)
                    Subtraction(num1, num2);
                else if (ch1==3)
                    Multiplication(num1, num2);
                else
                    Division(num1, num2);
            }
            else if(ch1==5||ch1==6||ch1==7) {
                int num;
                System.out.println("Enter a number to be operated upon:");
                num = sc.nextInt();
                if (ch1==5)
                    squareRoot(num);
                else if(ch1==6)
                    cubeRoot(num);
                else if(ch1==7)
                    square(num);
                else if(ch1==8)
                    trigo();
                else
                    System.out.println("Invalid Choice!!!!");
            }
        }
    }

