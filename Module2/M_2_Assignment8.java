package Module2;// Write   a   program that   implements two   constructors   in   the   class.
// We   call   the   other constructor using ‘this’ pointer, from the default constructor of the class.

public class M_2_Assignment8 {
    public int x,y;
    public M_2_Assignment8(){
        this(10,20);
        x=5;
        y=7;
    }

    public M_2_Assignment8(int a,int b){
        System.out.println("Parameterised constructor called using this");
        x=a;
        y=b;
    }

    public static void main(String[] args) {
        M_2_Assignment8 obj=new M_2_Assignment8();

    }
}
