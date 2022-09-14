package Module1;// Write  a program to accept a line  and check  how many consonants  and vowels are there  in line.
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String str=sc.nextLine();
        int c=0,v=0;
        char ch;
        str=str.toLowerCase();
        str=str.trim();
        for (int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch=='a'||ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++;
            }
            else if(ch==' '){
                continue;
            }
            else{
                c++;
            }
        }
        System.out.println("Consonants are "+c+" and Vowels are "+v);
    }
}
