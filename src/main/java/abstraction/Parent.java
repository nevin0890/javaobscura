package abstraction;

public abstract class Parent {
    public abstract void add();

    public void multi(int a ,int b ){
        int c=a*b;
        System.out.println("Instance method : "+c);

    }
}
