package Module1;// Write a program to count the number of words that start with capital letters.
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment_7 {
    static void count(String str){
        str=str.trim();
        String[] words;
        int count=0;
        String s;
        char ch;
        words=str.split(" ");
        for (String word : words) {
            s = word;
            ch = s.charAt(0);
            if (ch >= 65 && ch <= 90) {
                count++;
            }
        }
        System.out.println("Count is "+count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String str=sc.nextLine();
        count(str);
    }
}
