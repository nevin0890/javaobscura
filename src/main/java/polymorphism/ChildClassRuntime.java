package polymorphism;

public class ChildClassRuntime extends ParentClassRuntime{
    public static void main(String[] args) {
//        ChildClassRuntime c=new ChildClassRuntime();
//        c.getname("Nevin");
        ParentClassRuntime C=new ChildClassRuntime();
        C.getname("NVJ27");

    }

    public void getname(String name){
        super.getname("JOY");
        System.out.println("Child Name : " +name);
    }
}
