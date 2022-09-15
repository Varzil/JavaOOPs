//Write a program that implements simple example of Runtime Polymorphism
// with multilevel inheritance.(e.g., Animal or Shape)
package Module2;

public class M_2_Assignment11 {
    public static void main(String[] args) {
        Species man=new Species();
        man.print();
        Kingdom man2=new Phylum();
        man2.print();
        Phylum man3=new Species();
        man3.print();
//        Phylum man4= (Phylum) new Kingdom();

    }
}
class Kingdom{
    void print(){
        System.out.println("Animalia");
    }
}
class Phylum extends Kingdom{
    void print(){
        System.out.println("Chordata");
    }
}
class Species extends Phylum{
    void print(){
//        super.print();
        System.out.println("Homo Sapiens");
    }
}

