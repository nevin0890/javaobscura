package Programs;

import java.util.Scanner;

public class ifsample {
    public static void main(String[] args) {
        int num =5;
        if (num>0){
            System.out.println("positive number");
        }
        if (num<0){
            System.out.println("NEGATIVE NUMBER");
        }
    }

    public static class SumOfTwo {
        public static void main(String[] args) {
            System.out.println("Enter 2 numbers");
            Scanner s=new Scanner(System.in);
            int n1=s.nextInt();
            int n2=s.nextInt();
            int result=n1+n2;
            System.out.println("result is "+result);
        }
    }
}
