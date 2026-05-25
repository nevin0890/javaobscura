package Programs;

public class ConstructerWithParameters {
    public ConstructerWithParameters(int a, int b){
        int result=a+b;
        System.out.println( "Result is : "+result);
    }

    public static void main(String[] args) {
      ConstructerWithParameters obj = new ConstructerWithParameters(34,16);
    }
}
