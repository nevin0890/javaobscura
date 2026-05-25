package singleinheritance;

public class ClildClass  extends ParentClass{
    public static void main(String[] args) {
        ClildClass obj=new ClildClass();
        obj.add(10,20);
        obj.display();


    }
    public void display(){
        System.out.println("CHILD");

    }
}
