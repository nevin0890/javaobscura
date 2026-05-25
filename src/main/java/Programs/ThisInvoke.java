package Programs;

public class ThisInvoke {
    public static void main(String[] args) {
        ThisInvoke inv = new ThisInvoke();
        inv.add();

    }
    public void add(){
        System.out.println("sum");
        this.multi(5,10);

    }
    public void multi(int a,int b){
        int result=a*b;
        System.out.println("result="+result);

    }
}
