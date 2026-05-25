package Programs;

public class ConstructorOverloading {
    public static void main(String[] args) {
        ConstructorOverloading c =new ConstructorOverloading();
        ConstructorOverloading c1 =new ConstructorOverloading(12,24);
        ConstructorOverloading c2 =new ConstructorOverloading("Nevin");


    }
    public ConstructorOverloading(){
        System.out.println("non parameterised");

    }
    public  ConstructorOverloading(int a,int b){
        int result=a+b;
        System.out.println("Result = "+ result);

    }
    public ConstructorOverloading(String n){
        System.out.println(n);
    }
}
