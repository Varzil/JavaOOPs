/*
Create  a  class  which  askthe  user  to  enter  a  sentence,
and  it  should  display  count  of  each vowel type in the sentence.
The program should continue till user enters a word “quit”.
Display the total count of each vowel for all sentences.
 */
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
public class Assignment_8 {
    static void count(String str){
        char ch;
        int c=0,v=0;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            str=str.toLowerCase();
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
        System.out.println("Number of Consonants in string are "+c+" Vowels are "+v+"\n");
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(new InputStreamReader(System.in));
        String str;

        while(true){
            System.out.println("Enter string ");
            str=sc.nextLine();
            if(Objects.equals(str, "quit")){
                break;
            }
            else{
                count(str);
            }
        }
    }
}
