package Programs;

public class SumOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int result = a + b;
        System.out.println("Sum Is = " + result);
    }
}