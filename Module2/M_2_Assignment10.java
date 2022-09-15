//Java Program to demonstrate the real scenario (e.g., bank) of Java Method Overriding
// where three classes are overriding the method of a parent class. Creating a parent class.
package Module2;

public class M_2_Assignment10 {
    public static void main(String[] args) {
        HDFC obj=new HDFC();
        obj.returnROI();
        SBI obj2=new SBI();
        obj2.returnROI();
    }

}
class Bank{
    void returnROI(){
        System.out.println("returning ROI\n");
    }
}
class SBI extends Bank{
    void returnROI(){
        super.returnROI();
        System.out.println("SBI ROI is 6%\n");
    }
}
class HDFC extends Bank{
    void returnROI(){
        super.returnROI();
        System.out.println("HDFC ROI is 8%\n");
    }
}

