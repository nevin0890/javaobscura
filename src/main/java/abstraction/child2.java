package abstraction;

public class child2  implements parent2{

    @Override
    public void add() {
        System.out.println("addition");
    }

    @Override
    public void multi() {
        System.out.println("multiplication");

    }
    public void substraction(){
        System.out.println("substraction");
    }

    public static void main(String[] args) {
        child2 c2=new child2();
        c2.add();
        c2.multi();
        c2.substraction();
    }
}
