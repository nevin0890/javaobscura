package accessspecifier;

public class DefaultPgm {
    public static void main(String[] args) {
        DefaultPgm d=new DefaultPgm();
        d.GetDetils("Nevin",24);

    }
    void  GetDetils(String name ,int age){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
