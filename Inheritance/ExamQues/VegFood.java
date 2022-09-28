package Inheritance.ExamQues;

public class VegFood extends Food{
    @Override
    void recipe(String str) {
        System.out.println("Veg food : "+str);
    }
}
