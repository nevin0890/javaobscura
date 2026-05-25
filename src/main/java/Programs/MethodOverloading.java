package Programs;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.add();
        MethodOverloading.add(10,20);
        MethodOverloading.add(25F,30F);

    }

    public static void add() {
        System.out.println("ADD");

    }

    public static void  add(int a,int b) {
        int result=a+b;
        System.out.println(result);

    }
    public static void add(float a,float b){
        float sum=a+b;
        System.out.println(sum);

    }
}
