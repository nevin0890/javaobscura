package abstraction;

public class child extends Parent{
    public static void main(String[] args) {

        child c=new child();
        c.add();
        c.multi(12,23);
        c.getname("nevin");



    }
    public void  getname(String name ){
        System.out.println("Name : "+name);
    }

    @Override
    public void add() {
        System.out.println("child overridden");
    }

}
