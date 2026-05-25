package Programs;

public class InstanceMethod {
    public static void main(String[] args) {
        InstanceMethod S= new InstanceMethod();
        S.add(12,34);
        S.sum();

    }
    public void  add(int a,int b){
        int sum=a+b;
        System.out.println("Sum is : "+sum);
    }
    public void sum(){
        System.out.println("Value not available");
    }
}
