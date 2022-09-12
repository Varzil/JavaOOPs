// Write  a  program  in  Java  to  demonstrate  single  inheritance,  multilevel  inheritance  and hierarchical inheritance.

public class M_2_Assignment9_Single {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
        dog.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking....");
    }
}