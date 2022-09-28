package Inheritance.Calculator;

public class Calculation {
    protected void add(int a,int b){
        System.out.println("Sum is "+(a+b));
    }
    protected void sub(int a,int b){
        System.out.println("Diff is "+(a-b));
    }
    protected void mul(int a,int b){
        System.out.println("Mul is "+(a*b));
    }
    protected void div(int a,int b){
        System.out.println("Div is "+(a/b));
    }
    protected void modulus(int a,int b){
        System.out.println("Mod is "+(a%b));
    }

}
