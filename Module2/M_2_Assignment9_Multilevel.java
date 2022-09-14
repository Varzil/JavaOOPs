package Module2;

// MultiLevel Inheritance
public class M_2_Assignment9_Multilevel {
    public static void main(String[] args) {
        Puppy pup=new Puppy();
        pup.age();
        pup.eat();
        pup.Trait();
    }
}
class Animals{
    void eat(){
        System.out.println("Eating....");
    }
}
class Dogs extends Animals{
    void Trait(){
        System.out.println("Ruthless.....");
    }

}
class Puppy extends Dogs{
    void age(){
        System.out.println("5 Months Age ✌");
    }
}
