package exception;

public class MultipleException {
    public static void main(String[] args) {
        try{
//            int a =10;
//            int res=a/0;
//            System.out.println("RESULT = "+res);

            int b[]=new int[5];
            b[5]=10/0;
        }
//        catch (ArithmeticException a){
//            System.out.println(" Cant be divided by zero ");
//        }
        catch (ArrayIndexOutOfBoundsException b){
            System.out.println("Invalid index ");
        }
        //for unknown exception
        catch (Exception E){
            System.out.println("Exception caught : "+E);
        }


}
}
