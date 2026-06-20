package exception;

public class ExceptionPgm {
    public static void main(String[] args) {

        try {
            int a = 9;
            int res = a / 0;
            System.out.println("Result : " + res);

        }
      catch (ArithmeticException A){
           System.out.println("Cant be divided by zero");

      }
        finally {

            System.out.println("FINAL");
        }

    }
}

