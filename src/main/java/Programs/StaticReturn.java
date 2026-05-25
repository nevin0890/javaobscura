package Programs;

public class StaticReturn {
    public static void main(String[] args) {
        System.out.println(StaticReturn.addition(3,7));
        float Multi = StaticReturn.multiplication(5,10);
        System.out.println(Multi);


    }
    public static int addition(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static float multiplication(int a,int b) {
        int result=a*b;
        return result;

    }
}
