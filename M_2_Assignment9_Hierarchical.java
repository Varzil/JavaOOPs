public class M_2_Assignment9_Hierarchical {
    public static void main(String[] args) {
        Engineer kathan=new Engineer();
        Teacher neha=new Teacher();
        kathan.cgpa("kathan",9);
        kathan.experience("kathan",3);
        neha.successfulStudents("neha",4);
        neha.experience("neha",4);
    }
}
class Employee{
    protected void experience(String name,int years){
        System.out.println(name+"'s experience is "+years);
    }
}
class Engineer extends Employee{
    protected void cgpa(String name,int cgp){
        System.out.println(name+" Cgpa is "+cgp);
    }
}
class Teacher extends Employee{
    protected void successfulStudents(String name,int no){
        System.out.println( name+" has taught to "+no+" successful students");
    }
}
