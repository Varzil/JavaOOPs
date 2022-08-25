import java.io.InputStreamReader;
import java.util.Scanner;

// Write  a  program  that  calculate  percentage  marks  of  the  student  if  marks  of  6  subjects  are given.
public class Assignment_4 {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter the marks of six subjects");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        f=sc.nextInt();
        double average=(double)(a+b+c+d+e+f)/6.0;
        System.out.println("The percentage is "+average+" %");
    }
}
