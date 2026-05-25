package hierarchicalinheritance;

public class Son extends Father {
    public void SonInfo(String name, int age){

        System.out.println("Son : "+name);
        System.out.println("age : "+age);
    }

    public static void main(String[] args) {

        Son s=new Son();
        s.fathersName("Nevin");
        s.SonInfo("unknown",25);



    }
}
