package hierarchicalinheritance;

public class Daughter  extends  Father{
    public  void  DaughterDetails(String name,int age){
        System.out.println("Daughter : "+name);
        System.out.println("age : "+age);
    }

    public static void main(String[] args) {
        Daughter d=new Daughter();
        d.fathersName("Nevin");
        d.DaughterDetails("Unknown",21);
    }
}
