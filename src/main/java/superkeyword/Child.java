package superkeyword;

public class Child extends  Parent{
    int age=40;
    public Child(String remark){
        super("nothing");
        System.out.println("inside child");
    }
    public void GetName(String name){
        System.out.println("Child name : "+name);
        super.GetName("Nevin");
    }
    public void getage(){
        System.out.println("child age : "+age);
        System.out.println("parent age : " +super.age);
    }

    public static void main(String[] args) {
        Child OBJ =new Child("sample");
        OBJ.getage();
        OBJ.GetName("Liju");
    }

}
