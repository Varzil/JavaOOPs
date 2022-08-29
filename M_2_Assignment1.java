// Write  a  program  to create a “distance” class with methods where distance is computed in terms of feet and inches,
// how to create objects of a class.

import java.util.Scanner;
public class M_2_Assignment1 {
    int feet,inch;
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter feet: ");
        feet=sc.nextInt();
        System.out.println("Enter inches: ");
        inch=sc.nextInt();
        if (inch>=12){
            System.out.println("INVALID INPUT IN INCHES MAY CAUSE INACCURATE RESULT");
        }
    }
    void display(){
        System.out.println("The height is "+feet+" feet and "+inch+" inches");
    }
    void add(M_2_Assignment1 temp){
        int x,y;
        x=feet+ temp.feet;
        y=inch+ temp.inch;
        if(y>=12){
            x++;
            y-=12;
        }
        System.out.println("\nUPDATED\nThe height is "+x+" feets and "+y+" inches");
    }
    public static void main(String[] args) {
        try{
            M_2_Assignment1 Man1=new M_2_Assignment1();
            Man1.getData();
            Man1.display();
            M_2_Assignment1 Man2=new M_2_Assignment1();
            Man2.getData();
            Man2.display();
            Man1.add(Man2);
        }
        catch (Exception e){
            System.out.println("Error occurred");
        }

    }
}
