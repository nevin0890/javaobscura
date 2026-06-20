package exception;

public class ThrowPgm {
    public static void main(String[] args) {

        int age  =17;
        System.out.println("voting eligibility");
        if (age>=18){
            System.out.println("Eligible to vote");

        }
        else {
            throw new ArithmeticException(" Not Eligible ");

        }

    }
}
