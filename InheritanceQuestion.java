public class InheritanceQuestion {
    public static void main(String[] args) {

        CSEstudent varzil=new CSEstudent("varzil","21BCP090","CSE","Macbook");
        disp("varzil","21BCP090","CSE","Macbook");
        AutoStudent dhruv=new AutoStudent("dhruv","21BAE001","Automobile","Audi");
        disp("dhruv","21BAE001","Automobile","Audi");
    }
    public static void disp(String name, String roll, String b, String extra){
        System.out.println(name+" "+extra+" "+roll+" "+b+" ");
    }
}
class Student{
    String name, roll;
    Student(String name, String rollno){
        this.name=name;
        roll=rollno;
    }
}
class EnggStudent extends Student{
    String b;
    EnggStudent(String name,String roll){
        super(name,roll);

    }
    EnggStudent(String name,String roll,String branch){
        super(name,roll);
        b=branch;
    }
}
class CSEstudent extends EnggStudent{
    String laptopName;
    CSEstudent(String name, String roll, String branch) {
        super(name, roll, branch);
    }
    CSEstudent(String name,String roll,String branch,String laptop){
        super(name,roll,branch);
        laptopName=laptop;
    }
}
class AutoStudent extends EnggStudent{
    String fCar;

    AutoStudent(String name, String roll, String branch) {
        super(name, roll, branch);
    }
    AutoStudent(String name, String roll, String branch,String favCar) {
        super(name, roll, branch);
        fCar=favCar;
    }
}

