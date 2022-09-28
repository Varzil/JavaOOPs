package Inheritance.ExamQues;

public class NonVegFood extends Food {
    @Override
    void recipe(String str) {
        System.out.println("NonVeg food : "+str);
    }
}
