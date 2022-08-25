// Write  an  interactive  program to  print  a string  entered  in  a  pyramid  form.
// For  instance,  the string “stream” has to be displayed as follows:
/*
        S
       S t
      S t r
     S t r e
    S t r e a
   S t r e a m

 */

import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int len=str.length();
        int i,j;
        for (i=0;i<len;i++){
            for (j=(len/2)-i+2;j>0;j--){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
