// Write a program in Java to generate first n prime numbers.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Assignment_2 {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the value of N: ");
            int n=Integer.parseInt(br.readLine());
            int count=0,num=2;
            Assignment_2 obj=new Assignment_2();
            do {
                if (obj.isPrime(num)) {
                    count++;
                    System.out.println(num);
                }
                num++;
            } while (count != n);

        }
        catch (Exception ignored){
            System.out.println("Error Occurred");
        }
    }
    boolean isPrime(int n){
        boolean counter=false;
        int x=0;
        for (int i=1;i<=(n/2);i++){
            if(n%i==0){
                x++;
            }
        }
        if(x==1){
            counter=true;
        }
        return counter;
    }
}
