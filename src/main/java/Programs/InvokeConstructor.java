package Programs;

public class InvokeConstructor {
    public static void main(String[] args) {
   InvokeConstructor con =new InvokeConstructor();


    }
    public InvokeConstructor(){
        this(13);
        System.out.println("First");

    }
    public InvokeConstructor(int a){
        System.out.println(a);
    }
}
