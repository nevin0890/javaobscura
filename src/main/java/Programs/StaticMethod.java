package Programs;

public class StaticMethod {
    public static void sum(){
        System.out.println("SUM");

    }

    public static void addition(int a,int b) {
        int result=a+b;
        System.out.println("Result is : "+result);
    }
    public static void main(String[] args) {
        StaticMethod.sum();
        StaticMethod.addition(45,56);

    }

}
