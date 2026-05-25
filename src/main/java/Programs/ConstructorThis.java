package Programs;

public class ConstructorThis {
    public static void main(String[] args) {
        ConstructorThis obj=new ConstructorThis(5,6);
        obj.result();

    }
    int a;
    int b;
    public ConstructorThis( int a,int b){

       this.a=a;
       this.b=b;

    }
    public  void result(){
        System.out.println("The instance variables "+a+" and " +b);


    }

}
