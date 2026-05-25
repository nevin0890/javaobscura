package Assessment;

public class GradeCalculation {
    public static void main(String[] args) {
        int mark=71;
       if (mark>80){
           System.out.println("A grade");
       } else if (mark>70) {
           System.out.println("B grade");
       }
       else if (mark>60 ){
           System.out.println("C grade");
       }
       else if (mark>50){
           System.out.println("C grade");
       }
       else if (mark>=40 ){
           System.out.println("D grade");
       }
       else if (mark<40){
           System.out.println("Failed");
       }
    }
}
