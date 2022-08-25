//Write  an  interactive  program  to  print  a  diamond shape.
// For  example,  if  user  enters  the number 3, the diamond will be as follows:
/*
    *
   * *
  * * *
   * *
    *

 */

import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,j;
        for (i=0;i<n;i++){
            for (j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i=0;i<n-1;i++){
            for (j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (j=n-1-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
