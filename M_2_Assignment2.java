// Modify the “distance” class by creating constructor for assigning values (feet and inches) to the distance object.
// Create another object and assign second object as reference variable to another object reference variable.
// Further, create a third object which is a clone of the first object.

public class M_2_Assignment2 {
    public static void main(String[] args) {
        Distance d1=new Distance(10,11);
        Distance d2=new Distance(3,5);
        Distance d3;
        d3=d1;
    }
}
class Distance{
    Distance(int feet,int inch){
        System.out.println("The feet : "+feet+" and inch is : "+inch);
    }
}
