package Assessment;

public class SwapWithTemp {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("before swapping");
        System.out.println("A="+a);
        System.out.println("B"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping");
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}
